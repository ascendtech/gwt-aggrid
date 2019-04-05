package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CellDoubleClickedHandler {
	void onDoubleCellClicked(CellDoubleClickedEvent event);
}
