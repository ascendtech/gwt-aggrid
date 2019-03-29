package us.ascendtech.client.aggrid;

import elemental2.core.JsArray;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class GetRowParams<T> {

	private Double startRow;
	private Double endRow;
	private JsArray<SortModel> sortModel;

	@JsMethod
	public native void successCallback(T rowsThisPage, Double lastRow);

	@JsMethod
	public native void failCallback();

	@JsOverlay
	public final Double getStartRow() {
		return startRow;
	}

	@JsOverlay
	public final void setStartRow(Double startRow) {
		this.startRow = startRow;
	}

	@JsOverlay
	public final Double getEndRow() {
		return endRow;
	}

	@JsOverlay
	public final void setEndRow(Double endRow) {
		this.endRow = endRow;
	}

	@JsOverlay
	public final JsArray<SortModel> getSortModel() {
		return sortModel;
	}

	@JsOverlay
	public final void setSortModel(JsArray<SortModel> sortModel) {
		this.sortModel = sortModel;
	}
}
