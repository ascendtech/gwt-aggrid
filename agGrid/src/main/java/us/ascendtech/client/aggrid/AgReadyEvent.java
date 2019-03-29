package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class AgReadyEvent<T> {

	private GridApi<T> api;

	@JsOverlay
	public final GridApi<T> getApi() {
		return api;
	}

	@JsOverlay
	public final void setApi(GridApi<T> api) {
		this.api = api;
	}
}
