package us.ascendtech.client.aggrid.events.column;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ColumnRowGroupChangedHandler {
	void onColumnRowGroupChanged(ColumnRowGroupChangedEvent event);
}
