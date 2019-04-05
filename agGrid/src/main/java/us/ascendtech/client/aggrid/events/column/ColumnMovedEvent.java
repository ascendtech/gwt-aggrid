package us.ascendtech.client.aggrid.events.column;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ColumnMovedEvent<T> extends ColumnEvent {

	private Double toIndex;

	@JsOverlay
	public final Double getToIndex() {
		return toIndex;
	}

	@JsOverlay
	public final void setToIndex(Double toIndex) {
		this.toIndex = toIndex;
	}
}
