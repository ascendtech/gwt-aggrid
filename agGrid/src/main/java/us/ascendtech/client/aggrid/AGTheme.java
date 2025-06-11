package us.ascendtech.client.aggrid;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "window")
public interface AGTheme {
	@JsProperty(name = "themeBalham")
	Theme getThemeBalham();

	@JsProperty(name = "themeQuartz")
	Theme getThemeQuartz();

	@JsProperty(name = "themeMaterial")
	Theme getThemeMaterial();

	@JsProperty(name = "themeAlpine")
	Theme getThemeAlpine();
}