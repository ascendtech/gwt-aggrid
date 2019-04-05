package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface RangeSelectionChangedHandler {

	void onRangeSelectiongChanged(RangeSelectionChangedEvent event);

}
