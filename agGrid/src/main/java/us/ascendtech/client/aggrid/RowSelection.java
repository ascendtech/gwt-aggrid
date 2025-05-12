package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class RowSelection {

	private String mode;
	private boolean enableClickSelection;
	private boolean checkboxes;

	@JsOverlay
	public final String getMode() {
		return mode;
	}

	@JsOverlay
	public final void setMode(String mode) {
		this.mode = mode;
	}

	@JsOverlay
	public final boolean isEnableClickSelection() {
		return enableClickSelection;
	}

	@JsOverlay
	public final void setEnableClickSelection(boolean enableClickSelection) {
		this.enableClickSelection = enableClickSelection;
	}

	@JsOverlay
	public final boolean isCheckboxes() {
		return checkboxes;
	}

	@JsOverlay
	public final void setCheckboxes(boolean checkboxes) {
		this.checkboxes = checkboxes;
	}
}