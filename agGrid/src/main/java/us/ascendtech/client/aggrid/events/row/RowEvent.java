package us.ascendtech.client.aggrid.events.row;

import elemental2.dom.Event;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import us.ascendtech.client.aggrid.RowNode;
import us.ascendtech.client.aggrid.events.AgGridEvent;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class RowEvent<T> extends AgGridEvent {

	private RowNode<T> node;
	private T data;
	private Double rowIndex;
	private String rowPinned;
	private Event event;

	@JsOverlay
	public final RowNode<T> getNode() {
		return node;
	}

	@JsOverlay
	public final void setNode(RowNode<T> node) {
		this.node = node;
	}

	@JsOverlay
	public final T getData() {
		return data;
	}

	@JsOverlay
	public final void setData(T data) {
		this.data = data;
	}

	@JsOverlay
	public final Double getRowIndex() {
		return rowIndex;
	}

	@JsOverlay
	public final void setRowIndex(Double rowIndex) {
		this.rowIndex = rowIndex;
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
	public final Event getEvent() {
		return event;
	}

	@JsOverlay
	public final void setEvent(Event event) {
		this.event = event;
	}
}
