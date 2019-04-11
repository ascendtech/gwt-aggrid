package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class NullComparator {

	private boolean equals;
	private boolean lessThan;
	private boolean greaterThan;

	@JsOverlay
	public final boolean isEquals() {
		return equals;
	}

	@JsOverlay
	public final void setEquals(boolean equals) {
		this.equals = equals;
	}

	@JsOverlay
	public final boolean isLessThan() {
		return lessThan;
	}

	@JsOverlay
	public final void setLessThan(boolean lessThan) {
		this.lessThan = lessThan;
	}

	@JsOverlay
	public final boolean isGreaterThan() {
		return greaterThan;
	}

	@JsOverlay
	public final void setGreaterThan(boolean greaterThan) {
		this.greaterThan = greaterThan;
	}
}
