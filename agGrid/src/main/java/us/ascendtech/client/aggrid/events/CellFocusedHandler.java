package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CellFocusedHandler {

	void onCellFocused(CellFocusedEvent event);

}
