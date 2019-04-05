package us.ascendtech.client.aggrid.events.column;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ColumnVisibleHandler {
	void onColumnVisible(ColumnVisibleEvent event);
}
