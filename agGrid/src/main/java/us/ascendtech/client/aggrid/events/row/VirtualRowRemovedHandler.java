package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface VirtualRowRemovedHandler {
	void onVirtualRowRemoved(VirtualRowRemovedEvent event);
}
