package us.ascendtech.client.aggrid;

import elemental2.core.JsArray;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ExportParams<T> {

	private boolean skipHeader;
	private boolean columnGroups;
	private boolean skipGroups;
	private boolean skipFooters;
	private boolean suppressQuotes;
	private String filename;
	private String customHeader; // if you want to put some text at the top of the csv file, stick it here. You will need to include '\n' at the end, or many '\n' if you want the header to span lines
	private String customFooter;
	private boolean allColumns;
	private boolean onlySelected;
	private boolean onlySelectedAllPages;
	private String columnSeparator;
	private JsArray<String> columnKeys;
	private ShouldRowBeSkipped<T> shouldRowBeSkipped;
	private ProcessCellCallback<T> processCellCallback;
	private ProcessHeaderCallback<T> processHeaderCallback;

	@JsFunction
	interface ShouldRowBeSkipped<T> {
		void shouldRowBeSkipped(AGGridParams<T> params);
	}

	@JsFunction
	interface ProcessCellCallback<T> {
		void processCellCallback(AGGridParams<T> params);
	}

	@JsFunction
	interface ProcessHeaderCallback<T> {
		void processHeaderCallback(AGGridParams<T> params);
	}

	@JsOverlay
	public final boolean isSkipHeader() {
		return skipHeader;
	}

	@JsOverlay
	public final void setSkipHeader(boolean skipHeader) {
		this.skipHeader = skipHeader;
	}

	@JsOverlay
	public final boolean isColumnGroups() {
		return columnGroups;
	}

	@JsOverlay
	public final void setColumnGroups(boolean columnGroups) {
		this.columnGroups = columnGroups;
	}

	@JsOverlay
	public final boolean isSkipGroups() {
		return skipGroups;
	}

	@JsOverlay
	public final void setSkipGroups(boolean skipGroups) {
		this.skipGroups = skipGroups;
	}

	@JsOverlay
	public final boolean isSkipFooters() {
		return skipFooters;
	}

	@JsOverlay
	public final void setSkipFooters(boolean skipFooters) {
		this.skipFooters = skipFooters;
	}

	@JsOverlay
	public final boolean isSuppressQuotes() {
		return suppressQuotes;
	}

	@JsOverlay
	public final void setSuppressQuotes(boolean suppressQuotes) {
		this.suppressQuotes = suppressQuotes;
	}

	@JsOverlay
	public final String getFilename() {
		return filename;
	}

	@JsOverlay
	public final void setFilename(String filename) {
		this.filename = filename;
	}

	@JsOverlay
	public final String getCustomHeader() {
		return customHeader;
	}

	@JsOverlay
	public final void setCustomHeader(String customHeader) {
		this.customHeader = customHeader;
	}

	@JsOverlay
	public final String getCustomFooter() {
		return customFooter;
	}

	@JsOverlay
	public final void setCustomFooter(String customFooter) {
		this.customFooter = customFooter;
	}

	@JsOverlay
	public final boolean isAllColumns() {
		return allColumns;
	}

	@JsOverlay
	public final void setAllColumns(boolean allColumns) {
		this.allColumns = allColumns;
	}

	@JsOverlay
	public final boolean isOnlySelected() {
		return onlySelected;
	}

	@JsOverlay
	public final void setOnlySelected(boolean onlySelected) {
		this.onlySelected = onlySelected;
	}

	@JsOverlay
	public final boolean isOnlySelectedAllPages() {
		return onlySelectedAllPages;
	}

	@JsOverlay
	public final void setOnlySelectedAllPages(boolean onlySelectedAllPages) {
		this.onlySelectedAllPages = onlySelectedAllPages;
	}

	@JsOverlay
	public final String getColumnSeparator() {
		return columnSeparator;
	}

	@JsOverlay
	public final void setColumnSeparator(String columnSeparator) {
		this.columnSeparator = columnSeparator;
	}

	@JsOverlay
	public final JsArray<String> getColumnKeys() {
		return columnKeys;
	}

	@JsOverlay
	public final void setColumnKeys(JsArray<String> columnKeys) {
		this.columnKeys = columnKeys;
	}

	@JsOverlay
	public final void setShouldRowBeSkipped(ShouldRowBeSkipped<T> shouldRowBeSkipped) {
		this.shouldRowBeSkipped = shouldRowBeSkipped;
	}

	@JsOverlay
	public final void setProcessCellCallback(ProcessCellCallback<T> processCellCallback) {
		this.processCellCallback = processCellCallback;
	}

	@JsOverlay
	public final void setProcessHeaderCallback(ProcessHeaderCallback<T> processHeaderCallback) {
		this.processHeaderCallback = processHeaderCallback;
	}
}
