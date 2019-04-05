package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CellMouseOverHandler {
	void onMouseOver(CellMouseOverEvent event);
}
