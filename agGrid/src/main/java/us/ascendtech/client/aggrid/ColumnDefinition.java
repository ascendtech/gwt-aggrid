package us.ascendtech.client.aggrid;

import elemental2.core.JsArray;
import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;
import us.ascendtech.client.aggrid.events.row.CellClickedHandler;
import us.ascendtech.client.aggrid.events.row.CellContextMenuHandler;
import us.ascendtech.client.aggrid.events.row.CellDoubleClickedHandler;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ColumnDefinition<T> {

	private String headerName;
	private boolean columnGroupShow;
	private Object headerClass;
	private Object toolPanelClass;
	private boolean suppressToolPanel;
	private String field;
	private String colId;
	private Object type;
	private String filter;
	private int width;
	private int minWidth;
	private int maxWidth;
	private boolean hide;
	private String pinned;
	private boolean lockPosition;
	private boolean lockVisible;
	private boolean lockPinned;
	private boolean sortable;
	private String sort;
	private int sortedAt;
	private boolean resizable;
	private String headerTooltip;
	private String tooltipField;
	private Tooltip<T> tooltip;
	private boolean checkboxSelection;
	private boolean headerCheckboxSelection;
	private boolean headerCheckboxSelectionFilteredOnly;
	private boolean rowDrag;
	private Object cellClass;
	private JsPropertyMap<Object> cellStyle;
	private boolean editable;
	private CellValueChanged<T> onCellValueChanged;
	private CellRenderer<T> cellRenderer;
	private CellRenderer<T> floatingCellRenderer;
	private CellRendererSelector<T> cellRendererSelector;
	private String cellRendererFramework;
	private CellEditor<T> cellEditor;
	private ValueGetter<T> valueGetter;
	private ValueFormatter<T> valueFormatter;
	private ValueGetter<T> headerValueGetter;
	private ValueGetter<T> filterValueGetter;
	private ValueFormatter<T> floatingCellFormatter;
	private ValueSetter<T> valueSetter;
	private ValueParser<T> valueParser;
	private KeyCreator<T> keyCreator;
	private QuickFilterText<T> getQuickFilterText;
	private String aggFunc;
	private JsArray<String> allowedAggFuncs;
	private int rowGroupIndex;
	private int pivotIndex;
	private Comparator<T> comparator;
	private PivotComparator pivotComparator;
	private boolean unsortIcon;
	private boolean enableRowGroup;
	private boolean enablePivot;
	private boolean pivotTotals;
	private boolean enableValue;
	private boolean enableCellChangeFlash;
	private JsArray<String> menuTabs;
	private boolean suppressMenu;
	private boolean suppressSizeToFit;
	private boolean suppressMovable;
	private boolean suppressNavigable;
	private boolean suppressCellFlash;
	private SuppressKeyboardEvent<T> suppressKeyboardEvent;
	private CellClickedHandler onCellClicked;
	private CellDoubleClickedHandler onCellDopubleClicked;
	private CellContextMenuHandler onCellContextMenu;
	private boolean autoHeight;
	private boolean singleClickEdit;
	private String groupId;
	private JsArray<ColumnDefinition<T>> children;
	private boolean marryChildren;
	private boolean openByDefault;
	private Tooltip<T> headerGroupTooltip;
	private JsArray<String> sortingOrder;
	private boolean wrapText;

	@JsFunction
	public interface SuppressKeyboardEvent<T> {
		boolean suppress(CellEditorParams<T> params);
	}

	@JsFunction
	public interface QuickFilterText<T> {
		String getQuickFilterText(CellEditorParams<T> params);
	}

	@JsFunction
	public interface KeyCreator<T> {
		String getKey(CellEditorParams<T> params);
	}

	@JsFunction
	public interface CellEditor<T> {
		CellEditor<T> getCellEditor(CellEditorParams<T> params);
	}

	@JsFunction
	public interface CellRendererSelector<T> {
		CellRenderer<T> getRenderer(CellEditorParams<T> params);
	}

	@JsFunction
	public interface CellValueChanged<T> {
		void onCellValueChanged(CellEditorParams<T> params);
	}

	@JsFunction
	public interface Tooltip<T> {
		String tooltip(CellEditorParams<T> param);
	}

	@JsFunction
	public interface CellRenderer<T> {
		HTMLElement render(CellEditorParams<T> param);
	}

	@JsFunction
	public interface Comparator<T> {
		int compare(Object valueA, Object valueB, RowNode<T> nodeA, RowNode<T> nodeB, boolean isInverted);
	}

	@JsFunction
	public interface PivotComparator {
		int compare(Object valueA, Object valueB);
	}

	@JsFunction
	public interface ValueGetter<T> {
		String getValueGetter(CellEditorParams<T> param);
	}

	@JsFunction
	public interface ValueSetter<T> {
		boolean setValue(CellEditorParams<T> param);
	}

	@JsFunction
	public interface ValueFormatter<T> {
		String getFormattedValue(CellEditorParams<T> param);
	}

	@JsFunction
	public interface ValueParser<T> {
		String getParsedValue(CellEditorParams<T> param);
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
	public final boolean isColumnGroupShow() {
		return columnGroupShow;
	}

	@JsOverlay
	public final void setColumnGroupShow(boolean columnGroupShow) {
		this.columnGroupShow = columnGroupShow;
	}

	@JsOverlay
	public final Object getHeaderClass() {
		return headerClass;
	}

	@JsOverlay
	public final void setHeaderClass(Object headerClass) {
		this.headerClass = headerClass;
	}

	@JsOverlay
	public final Object getToolPanelClass() {
		return toolPanelClass;
	}

	@JsOverlay
	public final void setToolPanelClass(Object toolPanelClass) {
		this.toolPanelClass = toolPanelClass;
	}

	@JsOverlay
	public final boolean isSuppressToolPanel() {
		return suppressToolPanel;
	}

	@JsOverlay
	public final void setSuppressToolPanel(boolean suppressToolPanel) {
		this.suppressToolPanel = suppressToolPanel;
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
	public final String getColId() {
		return colId;
	}

	@JsOverlay
	public final void setColId(String colId) {
		this.colId = colId;
	}

	@JsOverlay
	public final Object getType() {
		return type;
	}

	@JsOverlay
	public final void setType(Object type) {
		this.type = type;
	}

	@JsOverlay
	public final String getFilter() {
		return filter;
	}

	@JsOverlay
	public final void setFilter(String filter) {
		this.filter = filter;
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
	public final int getMinWidth() {
		return minWidth;
	}

	@JsOverlay
	public final void setMinWidth(int minWidth) {
		this.minWidth = minWidth;
	}

	@JsOverlay
	public final int getMaxWidth() {
		return maxWidth;
	}

	@JsOverlay
	public final void setMaxWidth(int maxWidth) {
		this.maxWidth = maxWidth;
	}

	@JsOverlay
	public final boolean isHide() {
		return hide;
	}

	@JsOverlay
	public final void setHide(boolean hide) {
		this.hide = hide;
	}

	@JsOverlay
	public final String getPinned() {
		return pinned;
	}

	@JsOverlay
	public final void setPinned(String pinned) {
		this.pinned = pinned;
	}

	@JsOverlay
	public final boolean isLockPosition() {
		return lockPosition;
	}

	@JsOverlay
	public final void setLockPosition(boolean lockPosition) {
		this.lockPosition = lockPosition;
	}

	@JsOverlay
	public final boolean isLockVisible() {
		return lockVisible;
	}

	@JsOverlay
	public final void setLockVisible(boolean lockVisible) {
		this.lockVisible = lockVisible;
	}

	@JsOverlay
	public final boolean isLockPinned() {
		return lockPinned;
	}

	@JsOverlay
	public final void setLockPinned(boolean lockPinned) {
		this.lockPinned = lockPinned;
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
	public final String getSort() {
		return sort;
	}

	@JsOverlay
	public final void setSort(String sort) {
		this.sort = sort;
	}

	@JsOverlay
	public final int getSortedAt() {
		return sortedAt;
	}

	@JsOverlay
	public final void setSortedAt(int sortedAt) {
		this.sortedAt = sortedAt;
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
	public final String getHeaderTooltip() {
		return headerTooltip;
	}

	@JsOverlay
	public final void setHeaderTooltip(String headerTooltip) {
		this.headerTooltip = headerTooltip;
	}

	@JsOverlay
	public final String getTooltipField() {
		return tooltipField;
	}

	@JsOverlay
	public final void setTooltipField(String tooltipField) {
		this.tooltipField = tooltipField;
	}

	@JsOverlay
	public final void setTooltip(Tooltip<T> tooltip) {
		this.tooltip = tooltip;
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
	public final boolean isHeaderCheckboxSelection() {
		return headerCheckboxSelection;
	}

	@JsOverlay
	public final void setHeaderCheckboxSelection(boolean headerCheckboxSelection) {
		this.headerCheckboxSelection = headerCheckboxSelection;
	}

	@JsOverlay
	public final boolean isHeaderCheckboxSelectionFilteredOnly() {
		return headerCheckboxSelectionFilteredOnly;
	}

	@JsOverlay
	public final void setHeaderCheckboxSelectionFilteredOnly(boolean headerCheckboxSelectionFilteredOnly) {
		this.headerCheckboxSelectionFilteredOnly = headerCheckboxSelectionFilteredOnly;
	}

	@JsOverlay
	public final boolean isRowDrag() {
		return rowDrag;
	}

	@JsOverlay
	public final void setRowDrag(boolean rowDrag) {
		this.rowDrag = rowDrag;
	}

	@JsOverlay
	public final Object getCellClass() {
		return cellClass;
	}

	@JsOverlay
	public final void setCellClass(Object cellClass) {
		this.cellClass = cellClass;
	}

	@JsOverlay
	public final void setCellStyle(JsPropertyMap<Object> cellStyle) {
		this.cellStyle = cellStyle;
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
	public final void setOnCellValueChanged(CellValueChanged<T> onCellValueChanged) {
		this.onCellValueChanged = onCellValueChanged;
	}

	@JsOverlay
	public final void setCellRenderer(CellRenderer<T> cellRenderer) {
		this.cellRenderer = cellRenderer;
	}

	@JsOverlay
	public final void setFloatingCellRenderer(CellRenderer<T> floatingCellRenderer) {
		this.floatingCellRenderer = floatingCellRenderer;
	}

	@JsOverlay
	public final void setCellRendererSelector(CellRendererSelector<T> cellRendererSelector) {
		this.cellRendererSelector = cellRendererSelector;
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
	public final void setCellEditor(CellEditor<T> cellEditor) {
		this.cellEditor = cellEditor;
	}

	@JsOverlay
	public final void setValueGetter(ValueGetter<T> valueGetter) {
		this.valueGetter = valueGetter;
	}

	@JsOverlay
	public final void setValueFormatter(ValueFormatter<T> valueFormatter) {
		this.valueFormatter = valueFormatter;
	}

	@JsOverlay
	public final void setHeaderValueGetter(ValueGetter<T> headerValueGetter) {
		this.headerValueGetter = headerValueGetter;
	}

	@JsOverlay
	public final void setFilterValueGetter(ValueGetter<T> filterValueGetter) {
		this.filterValueGetter = filterValueGetter;
	}

	@JsOverlay
	public final void setFloatingCellFormatter(ValueFormatter<T> floatingCellFormatter) {
		this.floatingCellFormatter = floatingCellFormatter;
	}

	@JsOverlay
	public final void setValueSetter(ValueSetter<T> valueSetter) {
		this.valueSetter = valueSetter;
	}

	@JsOverlay
	public final void setValueParser(ValueParser<T> valueParser) {
		this.valueParser = valueParser;
	}

	@JsOverlay
	public final void setKeyCreator(KeyCreator<T> keyCreator) {
		this.keyCreator = keyCreator;
	}

	@JsOverlay
	public final void setGetQuickFilterText(QuickFilterText<T> getQuickFilterText) {
		this.getQuickFilterText = getQuickFilterText;
	}

	@JsOverlay
	public final String getAggFunc() {
		return aggFunc;
	}

	@JsOverlay
	public final void setAggFunc(String aggFunc) {
		this.aggFunc = aggFunc;
	}

	@JsOverlay
	public final JsArray<String> getAllowedAggFuncs() {
		if (allowedAggFuncs == null) {
			allowedAggFuncs = new JsArray<>();
		}
		return allowedAggFuncs;
	}

	@JsOverlay
	public final void setAllowedAggFuncs(JsArray<String> allowedAggFuncs) {
		this.allowedAggFuncs = allowedAggFuncs;
	}

	@JsOverlay
	public final int getRowGroupIndex() {
		return rowGroupIndex;
	}

	@JsOverlay
	public final void setRowGroupIndex(int rowGroupIndex) {
		this.rowGroupIndex = rowGroupIndex;
	}

	@JsOverlay
	public final int getPivotIndex() {
		return pivotIndex;
	}

	@JsOverlay
	public final void setPivotIndex(int pivotIndex) {
		this.pivotIndex = pivotIndex;
	}

	@JsOverlay
	public final void setComparator(Comparator<T> comparator) {
		this.comparator = comparator;
	}

	@JsOverlay
	public final void setPivotComparator(PivotComparator pivotComparator) {
		this.pivotComparator = pivotComparator;
	}

	@JsOverlay
	public final boolean isUnsortIcon() {
		return unsortIcon;
	}

	@JsOverlay
	public final void setUnsortIcon(boolean unsortIcon) {
		this.unsortIcon = unsortIcon;
	}

	@JsOverlay
	public final boolean isEnableRowGroup() {
		return enableRowGroup;
	}

	@JsOverlay
	public final void setEnableRowGroup(boolean enableRowGroup) {
		this.enableRowGroup = enableRowGroup;
	}

	@JsOverlay
	public final boolean isEnablePivot() {
		return enablePivot;
	}

	@JsOverlay
	public final void setEnablePivot(boolean enablePivot) {
		this.enablePivot = enablePivot;
	}

	@JsOverlay
	public final boolean isPivotTotals() {
		return pivotTotals;
	}

	@JsOverlay
	public final void setPivotTotals(boolean pivotTotals) {
		this.pivotTotals = pivotTotals;
	}

	@JsOverlay
	public final boolean isEnableValue() {
		return enableValue;
	}

	@JsOverlay
	public final void setEnableValue(boolean enableValue) {
		this.enableValue = enableValue;
	}

	@JsOverlay
	public final boolean isEnableCellChangeFlash() {
		return enableCellChangeFlash;
	}

	@JsOverlay
	public final void setEnableCellChangeFlash(boolean enableCellChangeFlash) {
		this.enableCellChangeFlash = enableCellChangeFlash;
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
	public final boolean isSuppressMenu() {
		return suppressMenu;
	}

	@JsOverlay
	public final void setSuppressMenu(boolean suppressMenu) {
		this.suppressMenu = suppressMenu;
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
	public final boolean isSuppressMovable() {
		return suppressMovable;
	}

	@JsOverlay
	public final void setSuppressMovable(boolean suppressMovable) {
		this.suppressMovable = suppressMovable;
	}

	@JsOverlay
	public final boolean isSuppressNavigable() {
		return suppressNavigable;
	}

	@JsOverlay
	public final void setSuppressNavigable(boolean suppressNavigable) {
		this.suppressNavigable = suppressNavigable;
	}

	@JsOverlay
	public final boolean isSuppressCellFlash() {
		return suppressCellFlash;
	}

	@JsOverlay
	public final void setSuppressCellFlash(boolean suppressCellFlash) {
		this.suppressCellFlash = suppressCellFlash;
	}

	@JsOverlay
	public final void setSuppressKeyboardEvent(SuppressKeyboardEvent<T> suppressKeyboardEvent) {
		this.suppressKeyboardEvent = suppressKeyboardEvent;
	}

	@JsOverlay
	public final void setOnCellClicked(CellClickedHandler onCellClicked) {
		this.onCellClicked = onCellClicked;
	}

	@JsOverlay
	public final void setOnCellDopubleClicked(CellDoubleClickedHandler onCellDopubleClicked) {
		this.onCellDopubleClicked = onCellDopubleClicked;
	}

	@JsOverlay
	public final void setOnCellContextMenu(CellContextMenuHandler onCellContextMenu) {
		this.onCellContextMenu = onCellContextMenu;
	}

	@JsOverlay
	public final boolean isAutoHeight() {
		return autoHeight;
	}

	@JsOverlay
	public final void setAutoHeight(boolean autoHeight) {
		this.autoHeight = autoHeight;
	}

	@JsOverlay
	public final boolean isSingleClickEdit() {
		return singleClickEdit;
	}

	@JsOverlay
	public final void setSingleClickEdit(boolean singleClickEdit) {
		this.singleClickEdit = singleClickEdit;
	}

	@JsOverlay
	public final String getGroupId() {
		return groupId;
	}

	@JsOverlay
	public final void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	@JsOverlay
	public final JsArray<ColumnDefinition<T>> getChildren() {
		if (children == null) {
			children = new JsArray<>();
		}
		return children;
	}

	@JsOverlay
	public final void setChildren(JsArray<ColumnDefinition<T>> children) {
		this.children = children;
	}

	@JsOverlay
	public final boolean isMarryChildren() {
		return marryChildren;
	}

	@JsOverlay
	public final void setMarryChildren(boolean marryChildren) {
		this.marryChildren = marryChildren;
	}

	@JsOverlay
	public final boolean isOpenByDefault() {
		return openByDefault;
	}

	@JsOverlay
	public final void setOpenByDefault(boolean openByDefault) {
		this.openByDefault = openByDefault;
	}

	@JsOverlay
	public final void setHeaderGroupTooltip(Tooltip<T> headerGroupTooltip) {
		this.headerGroupTooltip = headerGroupTooltip;
	}

	@JsOverlay
	public final JsArray<String> getSortingOrder() {
		return sortingOrder;
	}

	@JsOverlay
	public final void setSortingOrder(JsArray<String> sortingOrder) {
		this.sortingOrder = sortingOrder;
	}

	@JsOverlay
	public final boolean isWrapText() {
		return wrapText;
	}

	@JsOverlay
	public final void setWrapText(boolean wrapText) {
		this.wrapText = wrapText;
	}
}
