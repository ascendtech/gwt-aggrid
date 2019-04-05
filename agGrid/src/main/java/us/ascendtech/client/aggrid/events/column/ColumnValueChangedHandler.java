package us.ascendtech.client.aggrid.events.column;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ColumnValueChangedHandler {
	void onColumnValueChanged(ColumnValueChangedEvent event);
}
