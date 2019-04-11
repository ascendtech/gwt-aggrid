package us.ascendtech.client.aggrid;

import elemental2.core.JsArray;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

import java.util.Date;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class FilterParams {

	private String newRowsAction;
	private boolean applyButton;
	private boolean clearButton;
	private boolean inRangeExclusive;
	private JsArray<String> filterOptions;
	private String defaultOption;
	private int debounceMs;
	private boolean caseSensitive;
	private boolean suppressAndOrCondition;
	private boolean browserDatePicker;
	private TextCustomComparator textCustomComparator;
	private TextFormatter textFormatter;
	private NullComparator nullComparator;
	private DateComparator comparator;

	@JsFunction
	public interface TextCustomComparator {
		boolean compare(String filter, Object gridValue, String filterText);
	}

	@JsOverlay
	public final void setTextCustomComparator(TextCustomComparator textCustomComparator) {
		this.textCustomComparator = textCustomComparator;
	}

	@JsFunction
	public interface TextFormatter {
		String format(String value);
	}

	@JsOverlay
	public final void setTextFormatter(TextFormatter textFormatter) {
		this.textFormatter = textFormatter;
	}

	@JsFunction
	public interface DateComparator {
		boolean compare(Date filterLocalDateAtMidnight, Date cellValue);
	}

}
