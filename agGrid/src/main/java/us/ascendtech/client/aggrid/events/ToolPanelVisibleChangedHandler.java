package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface ToolPanelVisibleChangedHandler {

	void onToolPanelVisibleChanged(ToolPanelVisibleChangedEvent event);

}
