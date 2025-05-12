package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class SelectionColumnDef {

	private int width;
	private int maxWidth;
	private boolean suppressHeaderMenuButton;
	private String pinned;

	@JsOverlay
	public final int getWidth() {
		return width;
	}

	@JsOverlay
	public final void setWidth(int width) {
		this.width = width;
	}

	@JsOverlay
	public final int getMaxWidth() {
		return maxWidth;
	}

	@JsOverlay
	public final void setMaxWidth(int maxWidth) {
		this.maxWidth = maxWidth;
	}

	@JsOverlay
	public final boolean isSuppressHeaderMenuButton() {
		return suppressHeaderMenuButton;
	}

	@JsOverlay
	public final void setSuppressHeaderMenuButton(boolean suppressHeaderMenuButton) {
		this.suppressHeaderMenuButton = suppressHeaderMenuButton;
	}

	@JsOverlay
	public final String getPinned() {
		return pinned;
	}

	@JsOverlay
	public final void setPinned(String pinned) {
		this.pinned = pinned;
	}
}