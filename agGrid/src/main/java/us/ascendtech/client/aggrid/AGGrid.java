package us.ascendtech.client.aggrid;

import elemental2.dom.Element;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true, name = "Grid")
public class AGGrid<T> {

	public AGGrid(Element div, GridOptions<T> gridOptions) {
	}
}
