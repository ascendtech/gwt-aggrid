package us.ascendtech.client.aggrid;

import elemental2.dom.Element;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class AGGridParams<T> {

	private GridApi<T> api;
	private ColumnDefinition<T> colDef;
	private ColumnApi<T> columnApi;
	private Object context;
	private T data;
	private Object value;
	private Element eGridCell;

	@JsOverlay
	public final GridApi<T> getApi() {
		return api;
	}

	@JsOverlay
	public final void setApi(GridApi<T> api) {
		this.api = api;
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

	@JsOverlay
	public final Object getContext() {
		return context;
	}

	@JsOverlay
	public final void setContext(Object context) {
		this.context = context;
	}

	@JsOverlay
	public final T getData() {
		return data;
	}

	@JsOverlay
	public final void setData(T data) {
		this.data = data;
	}

	@JsOverlay
	public final Object getValue() {
		return value;
	}

	@JsOverlay
	public final void setValue(Object value) {
		this.value = value;
	}

	@JsOverlay
	public final Element geteGridCell() {
		return eGridCell;
	}

	@JsOverlay
	public final void seteGridCell(Element eGridCell) {
		this.eGridCell = eGridCell;
	}
}
