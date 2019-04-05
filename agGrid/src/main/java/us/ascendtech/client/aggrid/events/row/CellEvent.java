package us.ascendtech.client.aggrid.events.row;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import us.ascendtech.client.aggrid.Column;
import us.ascendtech.client.aggrid.ColumnDefinition;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class CellEvent<T> extends RowEvent {

	private Column<T> column;
	private ColumnDefinition<T> colDef;
	private Object value;

	@JsOverlay
	public final Column<T> getColumn() {
		return column;
	}

	@JsOverlay
	public final void setColumn(Column<T> column) {
		this.column = column;
	}

	@JsOverlay
	public final ColumnDefinition<T> getColDef() {
		return colDef;
	}

	@JsOverlay
	public final void setColDef(ColumnDefinition<T> colDef) {
		this.colDef = colDef;
	}

	@JsOverlay
	public final Object getValue() {
		return value;
	}

	@JsOverlay
	public final void setValue(Object value) {
		this.value = value;
	}
}
