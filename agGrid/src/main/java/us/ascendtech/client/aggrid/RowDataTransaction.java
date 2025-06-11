package us.ascendtech.client.aggrid;

import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class RowDataTransaction<T> {

	private JsArray<T> add;
	private JsArray<T> remove;
	private JsArray<T> update;
	private Integer addIndex;

	@JsOverlay
	public final JsArray<T> getAdd() {
		return add;
	}

	@JsOverlay
	public final void setAdd(JsArray<T> add) {
		this.add = add;
	}

	@JsOverlay
	public final JsArray<T> getRemove() {
		return remove;
	}

	@JsOverlay
	public final void setRemove(JsArray<T> remove) {
		this.remove = remove;
	}

	@JsOverlay
	public final JsArray<T> getUpdate() {
		return update;
	}

	@JsOverlay
	public final void setUpdate(JsArray<T> update) {
		this.update = update;
	}

	@JsOverlay
	public final Integer getAddIndex() {
		return addIndex;
	}

	@JsOverlay
	public final void setAddIndex(Integer addIndex) {
		this.addIndex = addIndex;
	}
}
