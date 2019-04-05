package us.ascendtech.client.aggrid.events.column;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ColumnPinnedEvent<T> extends ColumnEvent {

	private boolean pinned;

	@JsOverlay
	public final boolean isPinned() {
		return pinned;
	}

	@JsOverlay
	public final void setPinned(boolean pinned) {
		this.pinned = pinned;
	}
}
