package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class FirstDataRendereredEvent<T> extends AgGridEvent {

	private Double firstRow;
	private Double lastRow;

	@JsOverlay
	public final Double getFirstRow() {
		return firstRow;
	}

	@JsOverlay
	public final void setFirstRow(Double firstRow) {
		this.firstRow = firstRow;
	}

	@JsOverlay
	public final Double getLastRow() {
		return lastRow;
	}

	@JsOverlay
	public final void setLastRow(Double lastRow) {
		this.lastRow = lastRow;
	}
}
