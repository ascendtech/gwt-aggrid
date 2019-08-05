import org.ajoberstar.reckon.gradle.ReckonExtension

plugins {
    java
    idea
    id("us.ascendtech.gwt.lib") version "0.4.16" apply false
    id("org.ajoberstar.reckon") version "0.8.0"
}

configure<ReckonExtension> {
    scopeFromProp()
    stageFromProp("rc", "final")
}


defaultTasks("build")

subprojects {

    apply(plugin = "java")
    apply(plugin = "maven")
    apply(plugin = "idea")

    defaultTasks("build")
    group = "us.ascendtech"

    repositories {
        mavenCentral()
    }

    configurations.all {
        // check for updates every build more than 10 minutes apart (for snapshots)
        resolutionStrategy.cacheChangingModulesFor(10, TimeUnit.MINUTES)
    }

    tasks.withType<JavaCompile> {
        options.isDebug = true
        options.debugOptions.debugLevel = "source,lines,vars"
        options.encoding = "UTF-8"
        options.compilerArgs.add("-parameters")
    }

    sourceSets {
        main {
            java {
                srcDir("src/main/java")
            }
            resources {
                srcDir("src/main/java")
            }
        }
    }

    idea.module {
        resourceDirs = resourceDirs - file("src/main/java")
    }

    val sourcesJar = tasks.register<Jar>("sourcesJar") {
        classifier = "sources"
        from(sourceSets.getByName("main").allSource)
    }

    artifacts.add("archives", sourcesJar)

    tasks.withType<Jar> {
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}