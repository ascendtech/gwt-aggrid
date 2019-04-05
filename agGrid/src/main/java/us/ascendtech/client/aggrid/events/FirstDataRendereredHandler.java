package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface FirstDataRendereredHandler {

	void onFirstDataRenderered(FirstDataRendereredEvent event);

}
