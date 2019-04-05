package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface RowDataUpdatedHandler {

	void onRowDataUpdated(RowDataUpdatedEvent event);

}
