package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface RowSelectedHandler {
	void onRowSelected(RowSelectedEvent event);
}
