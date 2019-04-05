package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface SelectionChangedHandler {

	void onSelectionChange(SelectionChangedEvent event);

}
