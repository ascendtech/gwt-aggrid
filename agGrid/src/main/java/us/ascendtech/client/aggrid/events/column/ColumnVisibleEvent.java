package us.ascendtech.client.aggrid.events.column;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ColumnVisibleEvent<T> extends ColumnEvent {

	private boolean visible;

	@JsOverlay
	public final boolean isVisible() {
		return visible;
	}

	@JsOverlay
	public final void setVisible(boolean visible) {
		this.visible = visible;
	}
}
