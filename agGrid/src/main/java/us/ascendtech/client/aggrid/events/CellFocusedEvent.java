package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import us.ascendtech.client.aggrid.Column;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class CellFocusedEvent<T> extends AgGridEvent {

	private Double rowIndex;
	private Column<T> column;
	private String rowPinned;
	private boolean forceBrowserFocus;

	@JsOverlay
	public final Double getRowIndex() {
		return rowIndex;
	}

	@JsOverlay
	public final void setRowIndex(Double rowIndex) {
		this.rowIndex = rowIndex;
	}

	@JsOverlay
	public final Column<T> getColumn() {
		return column;
	}

	@JsOverlay
	public final void setColumn(Column<T> column) {
		this.column = column;
	}

	@JsOverlay
	public final String getRowPinned() {
		return rowPinned;
	}

	@JsOverlay
	public final void setRowPinned(String rowPinned) {
		this.rowPinned = rowPinned;
	}

	@JsOverlay
	public final boolean isForceBrowserFocus() {
		return forceBrowserFocus;
	}

	@JsOverlay
	public final void setForceBrowserFocus(boolean forceBrowserFocus) {
		this.forceBrowserFocus = forceBrowserFocus;
	}
}
