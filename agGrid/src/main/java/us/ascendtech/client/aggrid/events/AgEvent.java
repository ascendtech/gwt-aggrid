package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class AgEvent {

	private String type;

	@JsOverlay
	public final String getType() {
		return type;
	}

	@JsOverlay
	public final void setType(String type) {
		this.type = type;
	}
}
