package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface FilterModifiedHandler {

	void onFilterModified(FilterModifiedEvent event);

}
