package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface RowDoubleClickedHandler {
	void onRowDoubleClicked(RowDoubleClickedEvent event);
}
