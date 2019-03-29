package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface GridReady<T> {
	AgReadyEvent<T> onGridReady();
}