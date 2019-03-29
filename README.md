GWT JSInterop wrapping of popular grid library [AG-Grid](https://www.ag-grid.com/).

## Getting Started

### Gradle

Add AST Repo
```gradle
  allprojects {
    repositories {
      ...
      maven { url 'https://maven.ascend-tech.us/repo' }
    }
  }
```

Add Dependency:
```gradle
  compile 'com.github.ascendtech:gwt-aggrid:1.0'
  compile 'com.github.ascendtech:gwt-aggrid:1.0:sources'
```

### Maven

Add AST Repo
```xml
  <repositories>
    <repository>
      <id>AST Maven</id>
      <url>https://maven.ascend-tech.us/repo</url>
    </repository>
  </repositories>
```
Add Dependency
```xml
  <dependency>
    <groupId>com.github.ascendtech</groupId>
    <artifactId>gwt-aggrid</artifactId>
    <version>1.0</version>
  </dependency>
  <dependency>
    <groupId>com.github.ascendtech</groupId>
    <artifactId>gwt-aggrid</artifactId>
    <version>1.0</version>
    <classifier>sources</classifier>
  </dependency>
```

### Example in Java

Add dependency to gwt.xml
```xml
<inherits name="us.ascendtech.AGGrid"/>
```

Make sure to inject AGGrid javascript on your ModuleLoad.

```java
SimplePanel tableDiv = new SimplePanel();
tableDiv.getElement().setClassName("ag-theme-balham");
tableDiv.getElement().getStyle().setOverflow(Style.Overflow.HIDDEN);

GridOptions<T> gridOptions = new GridOptions<>();
gridOptions.setGridApi(new GridApi<>());
gridOptions.setAnimateRows(true);
gridOptions.setRowHeight(35);
JsArray<ColumnDefinition> columnDefs = new JsArray<>();
gridOptions.setColumnDefs(columnDefs);

ColumnDefinition<T> columnOne = new ColumnDefinition<>();
columnOne.setHeaderName("Column One");
columnOne.setField("columnOne"); // the member variable name in T
columnOne.setColId("columnOne");
columnOne.setSortable(true);
columnOne.setResizable(true);
columnDefs.push(columnOne);

// column with custom cell renderer
ColumnDefinition<T> columnTwo = new ColumnDefinition<>();
columnTwo.setHeaderName("Column One");
columnTwo.setField("columnOne"); // the member variable name in T
columnTwo.setColId("columnOne");
columnTwo.setSortable(true);
columnTwo.setResizable(true);
columnTwo.setCellRenderer(params -> {
	HTMLDivElement alertButton = (HTMLDivElement) DomGlobal.document.createElement("button");
	
	alertButton.addEventListener("click", event -> {
		DomGlobal.alert("button clicked!")
	});

	return alertButton;
});
columnDefs.push(columnTwo);

new AGGrid<>(Js.cast(tableDiv.getElement()), gridOptions);

JsArray<T> currentData = new JsArray<>();
// add data objects

gridOptions.getGridApi().setRowData(currentData);
gridOptions.getGridApi().sizeColumnsToFit();

```
Please refer to [gwt-examples](https://github.com/ascendtech/gwt-examples) to see it used in a real project.

