package us.ascendtech.client.aggrid.events;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface AnimationQueueEmptyHandler {

	void onAnimationQueueEmpty(AnimationQueueEmptyEvent event);

}
