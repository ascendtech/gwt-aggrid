package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import us.ascendtech.client.aggrid.events.row.CellKeyDown;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class CellEditorParams<T> extends AGGridParams<T> {

	private int keyPress;
	private String charPress;
	private Column<T> column;
	private RowNode<T> node;
	private int rowIndex;
	private boolean cellStartedEdit;
	private CellKeyDown<T> onKeyDown;
	private boolean stopEditing;
	private ColumnDefinition.ValueParser parseValue;
	private ColumnDefinition.ValueFormatter formatValue;

	@JsOverlay
	public final int getKeyPress() {
		return keyPress;
	}

	@JsOverlay
	public final void setKeyPress(int keyPress) {
		this.keyPress = keyPress;
	}

	@JsOverlay
	public final String getCharPress() {
		return charPress;
	}

	@JsOverlay
	public final void setCharPress(String charPress) {
		this.charPress = charPress;
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
	public final RowNode<T> getNode() {
		return node;
	}

	@JsOverlay
	public final void setNode(RowNode<T> node) {
		this.node = node;
	}

	@JsOverlay
	public final int getRowIndex() {
		return rowIndex;
	}

	@JsOverlay
	public final void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	@JsOverlay
	public final boolean isCellStartedEdit() {
		return cellStartedEdit;
	}

	@JsOverlay
	public final void setCellStartedEdit(boolean cellStartedEdit) {
		this.cellStartedEdit = cellStartedEdit;
	}

	@JsOverlay
	public final CellKeyDown<T> getOnKeyDown() {
		return onKeyDown;
	}

	@JsOverlay
	public final void setOnKeyDown(CellKeyDown<T> onKeyDown) {
		this.onKeyDown = onKeyDown;
	}

	@JsOverlay
	public final boolean isStopEditing() {
		return stopEditing;
	}

	@JsOverlay
	public final void setStopEditing(boolean stopEditing) {
		this.stopEditing = stopEditing;
	}

	@JsOverlay
	public final ColumnDefinition.ValueParser getParseValue() {
		return parseValue;
	}

	@JsOverlay
	public final void setParseValue(ColumnDefinition.ValueParser parseValue) {
		this.parseValue = parseValue;
	}

	@JsOverlay
	public final ColumnDefinition.ValueFormatter getFormatValue() {
		return formatValue;
	}

	@JsOverlay
	public final void setFormatValue(ColumnDefinition.ValueFormatter formatValue) {
		this.formatValue = formatValue;
	}
}



