package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PaginationChangedEvent<T> extends AgGridEvent {

	private boolean animate;
	private boolean keepRenderedRows;
	private boolean newData;
	private boolean newPage;

	@JsOverlay
	public final boolean isAnimate() {
		return animate;
	}

	@JsOverlay
	public final void setAnimate(boolean animate) {
		this.animate = animate;
	}

	@JsOverlay
	public final boolean isKeepRenderedRows() {
		return keepRenderedRows;
	}

	@JsOverlay
	public final void setKeepRenderedRows(boolean keepRenderedRows) {
		this.keepRenderedRows = keepRenderedRows;
	}

	@JsOverlay
	public final boolean isNewData() {
		return newData;
	}

	@JsOverlay
	public final void setNewData(boolean newData) {
		this.newData = newData;
	}

	@JsOverlay
	public final boolean isNewPage() {
		return newPage;
	}

	@JsOverlay
	public final void setNewPage(boolean newPage) {
		this.newPage = newPage;
	}
}
