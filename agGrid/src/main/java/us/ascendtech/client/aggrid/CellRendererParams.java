package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class CellRendererParams {

	private boolean suppressCount;
	private boolean checkbox;
	private String innerRenderer;
	private boolean suppressDoubleClickExpand;

	@JsOverlay
	public final boolean isSuppressCount() {
		return suppressCount;
	}

	@JsOverlay
	public final void setSuppressCount(boolean suppressCount) {
		this.suppressCount = suppressCount;
	}

	@JsOverlay
	public final boolean isCheckbox() {
		return checkbox;
	}

	@JsOverlay
	public final void setCheckbox(boolean checkbox) {
		this.checkbox = checkbox;
	}

	@JsOverlay
	public final String getInnerRenderer() {
		return innerRenderer;
	}

	@JsOverlay
	public final void setInnerRenderer(String innerRenderer) {
		this.innerRenderer = innerRenderer;
	}

	@JsOverlay
	public final boolean isSuppressDoubleClickExpand() {
		return suppressDoubleClickExpand;
	}

	@JsOverlay
	public final void setSuppressDoubleClickExpand(boolean suppressDoubleClickExpand) {
		this.suppressDoubleClickExpand = suppressDoubleClickExpand;
	}
}
