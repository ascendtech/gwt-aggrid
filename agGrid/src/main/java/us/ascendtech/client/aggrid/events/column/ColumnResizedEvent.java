package us.ascendtech.client.aggrid.events.column;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ColumnResizedEvent<T> extends ColumnEvent {

	private boolean finished;

	@JsOverlay
	public final boolean isFinished() {
		return finished;
	}

	@JsOverlay
	public final void setFinished(boolean finished) {
		this.finished = finished;
	}
}
