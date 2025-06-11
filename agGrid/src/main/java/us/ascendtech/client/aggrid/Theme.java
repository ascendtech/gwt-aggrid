package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class Theme {

	@JsMethod
	public native Theme withParams(JsPropertyMap<Object> params);

}