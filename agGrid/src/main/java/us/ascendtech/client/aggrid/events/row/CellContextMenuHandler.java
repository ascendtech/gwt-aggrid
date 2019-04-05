package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CellContextMenuHandler {
	void onCellContextMenu(CellContextMenuEvent event);
}
