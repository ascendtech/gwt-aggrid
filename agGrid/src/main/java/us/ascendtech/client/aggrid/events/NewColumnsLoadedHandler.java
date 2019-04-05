package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface NewColumnsLoadedHandler {

	void onNewColumnsLoaded(NewColumnsLoadedEvent event);

}
