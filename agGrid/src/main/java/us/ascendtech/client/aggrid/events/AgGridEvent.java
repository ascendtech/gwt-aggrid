package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import us.ascendtech.client.aggrid.ColumnApi;
import us.ascendtech.client.aggrid.GridApi;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class AgGridEvent<T> extends AgEvent {

	private GridApi<T> api;
	private ColumnApi<T> columnApi;

	@JsOverlay
	public final GridApi<T> getApi() {
		return api;
	}

	@JsOverlay
	public final void setApi(GridApi<T> api) {
		this.api = api;
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
