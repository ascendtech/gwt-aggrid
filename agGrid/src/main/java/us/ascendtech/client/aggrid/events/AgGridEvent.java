package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import us.ascendtech.client.aggrid.ColumnApi;
import us.ascendtech.client.aggrid.GridApi;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class AgGridEvent<T> extends AgEvent {

	private GridApi<T> api;
	private ColumnApi<T> columnApi;

}
