package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface RowDataChangedHandler {

	void onRowDataChanged(RowDataChangedEvent event);

}
