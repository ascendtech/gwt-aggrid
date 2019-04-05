package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CellEditingStoppedHandler {
	void onCellEditingStopped(CellEditingStoppedEvent event);
}
