package us.ascendtech.client.aggrid.events.column;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ColumnMovedHandler {
	void onColumnMoved(ColumnMovedEvent event);
}
