package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface GridReadyHandler {

	void onGridReady(GridReadyEvent event);

}
