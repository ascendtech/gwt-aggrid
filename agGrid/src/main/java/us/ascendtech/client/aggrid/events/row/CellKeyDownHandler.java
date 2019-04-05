package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CellKeyDownHandler {
	void onCellKeyDown(CellKeyDown event);
}
