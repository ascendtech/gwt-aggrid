package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface DisplayedColumnsChangedHandler {

	void onDisplayedColumnsChanged(DisplayedColumnsChangedEvent event);

}
