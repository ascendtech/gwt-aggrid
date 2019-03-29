package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class FocusedCell<T> {

	private int rowIndex;
	private Column<T> column;

	@JsOverlay
	public final int getRowIndex() {
		return rowIndex;
	}

	@JsOverlay
	public final void setRowIndex(int rowIndex) {
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
}
