package us.ascendtech.client.aggrid;

import elemental2.core.JsArray;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class GridApi<T> {

	@JsMethod
	public native JsArray<T> getSelectedNodes();

	@JsMethod
	public native JsArray<T> getSelectedRows();

	@JsMethod
	public native void sizeColumnsToFit();

	@JsMethod
	public native void redrawRows();

	@JsMethod
	public native void setDatasource(DataSource<T> dataSource);

	@JsMethod
	public native void setColumnDefs(JsArray<ColumnDefinition> columnDefs);

	@JsMethod
	public native void ensureIndexVisible(int i);

	@JsMethod
	public native void ensureColumnVisible(ColumnDefinition firstCol);

	@JsMethod
	public native void setFocusedCell(int i, ColumnDefinition firstCol);

	@JsMethod
	public native void deselectAll();

	@JsMethod
	public native void selectAll();

	@JsMethod
	public native void showNoRowsOverlay();

	@JsMethod
	public native void setRowData(JsArray<T> rowData);

	@JsMethod
	public native FocusedCell getFocusedCell();

	@JsMethod
	public native RowNode<T> getDisplayedRowAtIndex(int rowIndex);

	@JsMethod
	public native String getValue(String colKey, RowNode<T> row);

	@JsMethod
	public native void updateRowData(RowDataTransaction rowDataTransaction);
}
