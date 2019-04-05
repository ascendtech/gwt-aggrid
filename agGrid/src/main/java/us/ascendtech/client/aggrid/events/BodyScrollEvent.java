package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class BodyScrollEvent<T> extends AgGridEvent {

	private String direction;
	private Double top;
	private Double left;

	@JsOverlay
	public final String getDirection() {
		return direction;
	}

	@JsOverlay
	public final void setDirection(String direction) {
		this.direction = direction;
	}

	@JsOverlay
	public final Double getTop() {
		return top;
	}

	@JsOverlay
	public final void setTop(Double top) {
		this.top = top;
	}

	@JsOverlay
	public final Double getLeft() {
		return left;
	}

	@JsOverlay
	public final void setLeft(Double left) {
		this.left = left;
	}
}
