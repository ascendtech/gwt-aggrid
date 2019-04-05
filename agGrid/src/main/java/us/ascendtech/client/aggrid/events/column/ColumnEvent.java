package us.ascendtech.client.aggrid.events.column;

import elemental2.core.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import us.ascendtech.client.aggrid.Column;
import us.ascendtech.client.aggrid.events.AgGridEvent;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ColumnEvent<T> extends AgGridEvent {

	private Column<T> column;
	private JsArray<Column<T>> columns;
	private String source;
}
