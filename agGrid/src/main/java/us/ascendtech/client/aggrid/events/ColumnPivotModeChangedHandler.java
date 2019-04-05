package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ColumnPivotModeChangedHandler {

	void onColumnPivotModeChanged(ColumnPivotModeChangedEvent event);

}
