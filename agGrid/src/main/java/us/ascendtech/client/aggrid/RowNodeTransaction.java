package us.ascendtech.client.aggrid;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class RowNodeTransaction<T> {

	private JsArray<RowNode<T>> add;
	private JsArray<RowNode<T>> remove;
	private JsArray<RowNode<T>> update;

	@JsOverlay
	public final JsArray<RowNode<T>> getAdd() {
		return add;
	}

	@JsOverlay
	public final void setAdd(JsArray<RowNode<T>> add) {
		this.add = add;
	}

	@JsOverlay
	public final JsArray<RowNode<T>> getRemove() {
		return remove;
	}

	@JsOverlay
	public final void setRemove(JsArray<RowNode<T>> remove) {
		this.remove = remove;
	}

	@JsOverlay
	public final JsArray<RowNode<T>> getUpdate() {
		return update;
	}

	@JsOverlay
	public final void setUpdate(JsArray<RowNode<T>> update) {
		this.update = update;
	}
}
