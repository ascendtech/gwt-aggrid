package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface SortChangedHandler {

	void onSortChanged(SortChangedEvent event);

}
