package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface DragStartedHandler {

	void onDragStarted(DragStartedEvent event);

}
