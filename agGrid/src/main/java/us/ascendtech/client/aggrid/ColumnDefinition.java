package us.ascendtech.client.aggrid;

import elemental2.core.JsArray;
import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ColumnDefinition<T> {

	private String headerName;
	private String field;
	private boolean checkboxSelection;
	private boolean editable;
	private boolean showRowGroup;
	private boolean sortable;
	private boolean resizable;
	private boolean suppressSizeToFit;
	private ValueGetter<T> valueGetter;
	private ValueFormatter<T> valueFormatter;
	private JsArray<ColumnDefinition> children;
	private String cellRendererFramework;
	private int width;
	private JsArray<String> menuTabs;
	private String colId;
	private Renderer<T> cellRenderer;
	private ComparatorFunction<T> comparator;
	private String sort;
	private CellRendererParams cellRendererParams;
	private String pinned;

	@JsFunction
	public interface Renderer<T> {
		HTMLElement render(AGGridParams<T> param);
	}

	@JsFunction
	public interface ComparatorFunction<T> {
		int compare(Object valueA, Object valueB, RowNode<T> nodeA, RowNode<T> nodeB, boolean isInverted);
	}

	@JsFunction
	public interface ValueGetter<T> {
		String getValueGetter(AGGridParams<T> param);
	}

	@JsFunction
	public interface ValueFormatter<T> {
		String getFormattedValue(AGGridParams<T> param);
	}

	@JsOverlay
	public final String getHeaderName() {
		return headerName;
	}

	@JsOverlay
	public final void setHeaderName(String headerName) {
		this.headerName = headerName;
	}

	@JsOverlay
	public final String getField() {
		return field;
	}

	@JsOverlay
	public final void setField(String field) {
		this.field = field;
	}

	@JsOverlay
	public final boolean isCheckboxSelection() {
		return checkboxSelection;
	}

	@JsOverlay
	public final void setCheckboxSelection(boolean checkboxSelection) {
		this.checkboxSelection = checkboxSelection;
	}

	@JsOverlay
	public final boolean isEditable() {
		return editable;
	}

	@JsOverlay
	public final void setEditable(boolean editable) {
		this.editable = editable;
	}

	@JsOverlay
	public final boolean isShowRowGroup() {
		return showRowGroup;
	}

	@JsOverlay
	public final void setShowRowGroup(boolean showRowGroup) {
		this.showRowGroup = showRowGroup;
	}

	@JsOverlay
	public final boolean isSortable() {
		return sortable;
	}

	@JsOverlay
	public final void setSortable(boolean sortable) {
		this.sortable = sortable;
	}

	@JsOverlay
	public final boolean isResizable() {
		return resizable;
	}

	@JsOverlay
	public final void setResizable(boolean resizable) {
		this.resizable = resizable;
	}

	@JsOverlay
	public final boolean isSuppressSizeToFit() {
		return suppressSizeToFit;
	}

	@JsOverlay
	public final void setSuppressSizeToFit(boolean suppressSizeToFit) {
		this.suppressSizeToFit = suppressSizeToFit;
	}

	@JsOverlay
	public final ValueGetter<T> getValueGetter() {
		return valueGetter;
	}

	@JsOverlay
	public final void setValueGetter(ValueGetter<T> valueGetter) {
		this.valueGetter = valueGetter;
	}

	@JsOverlay
	public final JsArray<ColumnDefinition> getChildren() {
		return children;
	}

	@JsOverlay
	public final void setChildren(JsArray<ColumnDefinition> children) {
		this.children = children;
	}

	@JsOverlay
	public final String getCellRendererFramework() {
		return cellRendererFramework;
	}

	@JsOverlay
	public final void setCellRendererFramework(String cellRendererFramework) {
		this.cellRendererFramework = cellRendererFramework;
	}

	@JsOverlay
	public final int getWidth() {
		return width;
	}

	@JsOverlay
	public final void setWidth(int width) {
		this.width = width;
	}

	@JsOverlay
	public final void setCellRenderer(Renderer<T> cellRenderer) {
		this.cellRenderer = cellRenderer;
	}

	@JsOverlay
	public final Renderer<T> getCellRenderer() {
		return cellRenderer;
	}

	@JsOverlay
	public final JsArray<String> getMenuTabs() {
		if (menuTabs == null) {
			menuTabs = new JsArray<>();
		}
		return menuTabs;
	}

	@JsOverlay
	public final void setMenuTabs(JsArray<String> menuTabs) {
		this.menuTabs = menuTabs;
	}

	@JsOverlay
	public final void setValueFormatter(ValueFormatter valueFormatter) {
		this.valueFormatter = valueFormatter;
	}

	@JsOverlay
	public final void setComparator(ComparatorFunction<T> comparator) {
		this.comparator = comparator;
	}

	@JsOverlay
	public final String getColId() {
		return colId;
	}

	@JsOverlay
	public final void setColId(String colId) {
		this.colId = colId;
	}

	@JsOverlay
	public final String getSort() {
		return sort;
	}

	@JsOverlay
	public final void setSort(String sort) {
		this.sort = sort;
	}

	@JsOverlay
	public final CellRendererParams getCellRendererParams() {
		return cellRendererParams;
	}

	@JsOverlay
	public final void setCellRendererParams(CellRendererParams cellRendererParams) {
		this.cellRendererParams = cellRendererParams;
	}

	@JsOverlay
	public final String getPinned() {
		return pinned;
	}

	@JsOverlay
	public final void setPinned(String pinned) {
		this.pinned = pinned;
	}
}
