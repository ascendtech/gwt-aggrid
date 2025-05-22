package us.ascendtech.client.aggrid;

import elemental2.core.JsObject;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "window")
public interface AGTheme {
	@JsProperty(name = "themeBalham")
	JsObject getThemeBalham();

	@JsProperty(name = "themeQuartz")
	JsObject getThemeQuartz();

	@JsProperty(name = "themeMaterial")
	JsObject getThemeMaterial();

	@JsProperty(name = "themeAlpine")
	JsObject getThemeAlpine();
}