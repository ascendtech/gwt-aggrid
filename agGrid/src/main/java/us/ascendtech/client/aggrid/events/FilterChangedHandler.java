package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface FilterChangedHandler {

	void onFilterChanged(FilterChangedEvent event);

}
