package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CellKeyPressHandler {
	void onCellKeyPress(CellKeyPress event);
}
