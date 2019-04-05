package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface PinnedRowDataChangedHandler {

	void onPinnedRowDataChanged(PinnedRowDataChangedEvent event);

}
