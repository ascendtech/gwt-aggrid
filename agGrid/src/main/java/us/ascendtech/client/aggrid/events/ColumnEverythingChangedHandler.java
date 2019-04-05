package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ColumnEverythingChangedHandler {

	void onColumnEverythingChangedEvent(ColumnEverythingChangedEvent event);

}
