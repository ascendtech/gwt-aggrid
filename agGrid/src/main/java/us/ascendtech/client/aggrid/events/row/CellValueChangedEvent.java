package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class CellValueChangedEvent<T> extends CellEvent {

	private Object oldValue;
	private Object newValue;

	@JsOverlay
	public final Object getOldValue() {
		return oldValue;
	}

	@JsOverlay
	public final void setOldValue(Object oldValue) {
		this.oldValue = oldValue;
	}

	@JsOverlay
	public final Object getNewValue() {
		return newValue;
	}

	@JsOverlay
	public final void setNewValue(Object newValue) {
		this.newValue = newValue;
	}
}
