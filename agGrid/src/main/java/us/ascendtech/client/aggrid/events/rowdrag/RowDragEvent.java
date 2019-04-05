package us.ascendtech.client.aggrid.events.rowdrag;

import elemental2.dom.MouseEvent;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import us.ascendtech.client.aggrid.RowNode;
import us.ascendtech.client.aggrid.events.AgGridEvent;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class RowDragEvent<T> extends AgGridEvent {

	private MouseEvent event;
	private RowNode<T> node;
	private Double overIndex;
	private RowNode<T> overNode;
	private Double y;
	private String vDirection;

	@JsOverlay
	public final MouseEvent getEvent() {
		return event;
	}

	@JsOverlay
	public final void setEvent(MouseEvent event) {
		this.event = event;
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
	public final Double getOverIndex() {
		return overIndex;
	}

	@JsOverlay
	public final void setOverIndex(Double overIndex) {
		this.overIndex = overIndex;
	}

	@JsOverlay
	public final RowNode<T> getOverNode() {
		return overNode;
	}

	@JsOverlay
	public final void setOverNode(RowNode<T> overNode) {
		this.overNode = overNode;
	}

	@JsOverlay
	public final Double getY() {
		return y;
	}

	@JsOverlay
	public final void setY(Double y) {
		this.y = y;
	}

	@JsOverlay
	public final String getvDirection() {
		return vDirection;
	}

	@JsOverlay
	public final void setvDirection(String vDirection) {
		this.vDirection = vDirection;
	}
}
