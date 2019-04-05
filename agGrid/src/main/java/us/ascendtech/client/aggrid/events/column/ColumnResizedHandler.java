package us.ascendtech.client.aggrid.events.column;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ColumnResizedHandler {
	void onColumnResized(ColumnResizedEvent event);
}
