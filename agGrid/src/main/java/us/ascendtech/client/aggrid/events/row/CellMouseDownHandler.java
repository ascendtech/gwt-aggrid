package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CellMouseDownHandler {
	void onMouseDown(CellMouseDownEvent event);
}
