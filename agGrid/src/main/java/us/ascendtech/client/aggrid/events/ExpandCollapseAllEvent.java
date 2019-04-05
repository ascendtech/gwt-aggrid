package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ExpandCollapseAllEvent<T> extends AgGridEvent {

	private String source;

	@JsOverlay
	public final String getSource() {
		return source;
	}

	@JsOverlay
	public final void setSource(String source) {
		this.source = source;
	}
}
