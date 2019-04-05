package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface VirtualColumnsChangedHandler {

	void onVirtualColumnsChanged(VirtualColumnsChangedEvent event);

}
