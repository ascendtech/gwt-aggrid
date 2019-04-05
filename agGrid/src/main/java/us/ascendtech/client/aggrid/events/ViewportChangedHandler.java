package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ViewportChangedHandler {

	void onViewportChanged(ViewportChangedEvent event);

}
