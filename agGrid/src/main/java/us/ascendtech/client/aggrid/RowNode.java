package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class RowNode<T> {

	private String id;
	private T data;
	private RowNode<T> parent;
	private int uiLevel;
	private boolean group;
	private boolean firstChild;
	private boolean lastChild;
	private int childIndex;
	private String rowPinned;
	private boolean canFlower;
	private int rowHeight;
	private int rowTop;
	private String quickFilterAggregateText;
	private boolean selected;

	@JsOverlay
	public final String getId() {
		return id;
	}

	@JsOverlay
	public final void setId(String id) {
		this.id = id;
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
	public final RowNode<T> getParent() {
		return parent;
	}

	@JsOverlay
	public final void setParent(RowNode<T> parent) {
		this.parent = parent;
	}

	@JsOverlay
	public final int getUiLevel() {
		return uiLevel;
	}

	@JsOverlay
	public final void setUiLevel(int uiLevel) {
		this.uiLevel = uiLevel;
	}

	@JsOverlay
	public final boolean isGroup() {
		return group;
	}

	@JsOverlay
	public final void setGroup(boolean group) {
		this.group = group;
	}

	@JsOverlay
	public final boolean isFirstChild() {
		return firstChild;
	}

	@JsOverlay
	public final void setFirstChild(boolean firstChild) {
		this.firstChild = firstChild;
	}

	@JsOverlay
	public final boolean isLastChild() {
		return lastChild;
	}

	@JsOverlay
	public final void setLastChild(boolean lastChild) {
		this.lastChild = lastChild;
	}

	@JsOverlay
	public final int getChildIndex() {
		return childIndex;
	}

	@JsOverlay
	public final void setChildIndex(int childIndex) {
		this.childIndex = childIndex;
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
	public final boolean isCanFlower() {
		return canFlower;
	}

	@JsOverlay
	public final void setCanFlower(boolean canFlower) {
		this.canFlower = canFlower;
	}

	@JsOverlay
	public final int getRowHeight() {
		return rowHeight;
	}

	@JsOverlay
	public final void setRowHeight(int rowHeight) {
		this.rowHeight = rowHeight;
	}

	@JsOverlay
	public final int getRowTop() {
		return rowTop;
	}

	@JsOverlay
	public final void setRowTop(int rowTop) {
		this.rowTop = rowTop;
	}

	@JsOverlay
	public final String getQuickFilterAggregateText() {
		return quickFilterAggregateText;
	}

	@JsOverlay
	public final void setQuickFilterAggregateText(String quickFilterAggregateText) {
		this.quickFilterAggregateText = quickFilterAggregateText;
	}

	@JsOverlay
	public final boolean isSelected() {
		return selected;
	}

	@JsOverlay
	public final void setSelected(boolean selected) {
		this.selected = selected;
	}
}
