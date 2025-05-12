import org.ajoberstar.reckon.gradle.ReckonExtension

plugins {
    java
    idea
    id("us.ascendtech.gwt.lib") version "0.9.2" apply false
    alias(libs.plugins.reckon)
}

reckon {
    setDefaultInferredScope("patch")
    setScopeCalc(calcScopeFromProp())
    snapshots()
    stages("beta", "final")
    setStageCalc(calcStageFromProp())
}


defaultTasks("build")

subprojects {

    apply(plugin = "java")
    apply(plugin = "maven-publish")
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
        dependsOn(JavaPlugin.CLASSES_TASK_NAME)
        archiveClassifier.set("sources")
        from(sourceSets.main.get().allJava)
    }

    artifacts.add("archives", sourcesJar)

    tasks.withType<Jar> {
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

}