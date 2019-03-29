package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class DataSource<T> {

	private Integer rowCount;

	private GetRows<T> getRows;

	@JsFunction
	public interface GetRows<T> {
		void getRows(GetRowParams params);
	}

	@JsOverlay
	public final Integer getRowCount() {
		return rowCount;
	}

	@JsOverlay
	public final void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

	@JsOverlay
	public final DataSource.GetRows<T> getGetRows() {
		return getRows;
	}

	@JsOverlay
	public final void setGetRows(GetRows<T> getRows) {
		this.getRows = getRows;
	}
}
