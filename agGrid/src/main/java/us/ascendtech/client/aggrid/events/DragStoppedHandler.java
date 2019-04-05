package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface DragStoppedHandler {

	void onDragStopped(DragStoppedEvent event);

}
