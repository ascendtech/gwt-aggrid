package us.ascendtech.client.aggrid;

import elemental2.core.JsArray;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ColumnApi<T> {

	@JsMethod
	public native void setColumnPinned(String field, boolean pin);

	@JsMethod
	public native void autoSizeColumns(JsArray<String> columnIds);

	@JsMethod
	public native void resetColumnState();

	@JsMethod
	public native JsArray<ColumnDefinition> getAllDisplayedColumns();
}
