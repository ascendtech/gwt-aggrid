package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface GridSizeChangedHandler {

	void onGridSizeChanged(GridSizeChangedEvent event);

}
