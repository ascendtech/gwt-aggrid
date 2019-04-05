package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CellClickedHandler {
	void onCellClicked(CellClickedEvent event);
}
