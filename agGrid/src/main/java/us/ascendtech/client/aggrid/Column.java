package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class Column<T> {

	private String colId;
	private ColumnDefinition<T> colDef;
	private ColumnApi<T> columnApi;

	@JsOverlay
	public final String getColId() {
		return colId;
	}

	@JsOverlay
	public final void setColId(String colId) {
		this.colId = colId;
	}

	@JsOverlay
	public final ColumnDefinition<T> getColDef() {
		return colDef;
	}

	@JsOverlay
	public final void setColDef(ColumnDefinition<T> colDef) {
		this.colDef = colDef;
	}

	@JsOverlay
	public final ColumnApi<T> getColumnApi() {
		return columnApi;
	}

	@JsOverlay
	public final void setColumnApi(ColumnApi<T> columnApi) {
		this.columnApi = columnApi;
	}
}
