package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface PaginationChangedHandler {

	void onPaginationChanged(PaginationChangedEvent event);

}
