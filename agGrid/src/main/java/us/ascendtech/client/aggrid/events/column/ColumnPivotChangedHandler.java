package us.ascendtech.client.aggrid.events.column;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ColumnPivotChangedHandler {
	void onColumnPivotChanged(ColumnPivotChangedEvent event);
}
