package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ModelUpdatedHandler {

	void onModelUpdated(ModelUpdatedEvent event);

}
