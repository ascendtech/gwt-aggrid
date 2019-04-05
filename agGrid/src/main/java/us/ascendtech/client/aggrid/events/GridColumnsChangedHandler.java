package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface GridColumnsChangedHandler {

	void onGridColumnsChanged(GridColumnsChangedEvent event);

}
