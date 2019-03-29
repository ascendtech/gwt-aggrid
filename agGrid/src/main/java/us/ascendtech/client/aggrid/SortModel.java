package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class SortModel<T> {

	private String colId;
	private String sort;

	@JsOverlay
	public final String getColId() {
		return colId;
	}

	@JsOverlay
	public final void setColId(String colId) {
		this.colId = colId;
	}

	@JsOverlay
	public final String getSort() {
		return sort;
	}

	@JsOverlay
	public final void setSort(String sort) {
		this.sort = sort;
	}
}
