package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface RowEditingStartedHandler {
	void onRowEditingStarted(RowEditingStartedEvent event);
}
