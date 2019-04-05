package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class RangeSelectionChangedEvent<T> extends AgGridEvent {

	private boolean started;
	private boolean finished;

	@JsOverlay
	public final boolean isStarted() {
		return started;
	}

	@JsOverlay
	public final void setStarted(boolean started) {
		this.started = started;
	}

	@JsOverlay
	public final boolean isFinished() {
		return finished;
	}

	@JsOverlay
	public final void setFinished(boolean finished) {
		this.finished = finished;
	}
}
