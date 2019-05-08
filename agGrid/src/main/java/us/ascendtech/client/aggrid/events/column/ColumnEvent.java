package us.ascendtech.client.aggrid.events.column;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import us.ascendtech.client.aggrid.Column;
import us.ascendtech.client.aggrid.events.AgGridEvent;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ColumnEvent<T> extends AgGridEvent {

	private Column<T> column;
	private JsArray<Column<T>> columns;
	private String source;

	@JsOverlay
	public final Column<T> getColumn() {
		return column;
	}

	@JsOverlay
	public final void setColumn(Column<T> column) {
		this.column = column;
	}

	@JsOverlay
	public final JsArray<Column<T>> getColumns() {
		return columns;
	}

	@JsOverlay
	public final void setColumns(JsArray<Column<T>> columns) {
		this.columns = columns;
	}

	@JsOverlay
	public final String getSource() {
		return source;
	}

	@JsOverlay
	public final void setSource(String source) {
		this.source = source;
	}
}
