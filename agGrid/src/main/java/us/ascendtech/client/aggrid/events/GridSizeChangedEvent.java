package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class GridSizeChangedEvent<T> extends AgGridEvent {

	private Double clientWidth;
	private Double clientHeight;

	@JsOverlay
	public final Double getClientWidth() {
		return clientWidth;
	}

	@JsOverlay
	public final void setClientWidth(Double clientWidth) {
		this.clientWidth = clientWidth;
	}

	@JsOverlay
	public final Double getClientHeight() {
		return clientHeight;
	}

	@JsOverlay
	public final void setClientHeight(Double clientHeight) {
		this.clientHeight = clientHeight;
	}
}
