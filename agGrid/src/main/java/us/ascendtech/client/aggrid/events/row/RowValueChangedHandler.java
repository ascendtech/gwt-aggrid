package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface RowValueChangedHandler {
	void onRowValueChanged(RowValueChangedEvent event);
}
