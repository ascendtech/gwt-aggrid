package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface RowGroupOpenedHandler {
	void onRowGroupOpened(RowGroupOpenedEvent event);
}
