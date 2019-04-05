package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ComponentStateChangedHandler {

	void onComponentStateChanged(ComponentStateChangedEvent event);

}
