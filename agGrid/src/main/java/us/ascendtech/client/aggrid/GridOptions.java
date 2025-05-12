package us.ascendtech.client.aggrid;

import elemental2.core.JsArray;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;
import us.ascendtech.client.aggrid.events.*;
import us.ascendtech.client.aggrid.events.column.ColumnMovedHandler;
import us.ascendtech.client.aggrid.events.column.ColumnPinnedHandler;
import us.ascendtech.client.aggrid.events.column.ColumnPivotChangedHandler;
import us.ascendtech.client.aggrid.events.column.ColumnResizedHandler;
import us.ascendtech.client.aggrid.events.column.ColumnRowGroupChangedHandler;
import us.ascendtech.client.aggrid.events.column.ColumnValueChangedHandler;
import us.ascendtech.client.aggrid.events.column.ColumnVisibleHandler;
import us.ascendtech.client.aggrid.events.row.*;
import us.ascendtech.client.aggrid.events.rowdrag.RowDragEndHandler;
import us.ascendtech.client.aggrid.events.rowdrag.RowDragEnterHandler;
import us.ascendtech.client.aggrid.events.rowdrag.RowDragLeaveHandler;
import us.ascendtech.client.aggrid.events.rowdrag.RowDragMoveHandler;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class GridOptions<T> {

	private boolean suppressPropertyNamesCheck;
	private GridApi<T> api;
	private ColumnApi<T> columnApi;
	private JsArray<ColumnDefinition<T>> columnDefs;
	private JsArray<T> rowData;
	private String rowModelType;
	private DataSource<T> datasource;
	private int cacheBlockSize;
	private JsPropertyMap<Object> components;
	private boolean animateRows;
	private boolean pagination;
	private int paginationPageSize;
	private boolean debug;
	private int cacheOverflowSize;
	private int maxConcurrentDatasourceRequests;
	private int infiniteInitialRowCount;
	private int maxBlocksInCache;
	private GetRowNodeId<T> getRowNodeId;
	private RowSelection rowSelection;
	private int rowHeight;
	private boolean suppressCellSelection;
	private boolean suppressRowClickSelection;
	private RowHeight<T> getRowHeight;
	private SelectionColumnDef selectionColumnDef;

	/** Events **/
	private CellClickedHandler onCellClicked;
	private CellDoubleClickedHandler onCellDoubleClicked;
	private CellFocusedHandler onCellFocused;
	private CellMouseOutHandler onCellMouseOver;
	private CellMouseOutHandler onCellMouseOut;
	private CellMouseDownHandler onCellMouseDown;
	private RowClickedHandler onRowClicked;
	private RowDoubleClickedHandler onRowDoubleClicked;
	private RowSelectedHandler onRowSelected;
	private SelectionChangedHandler onSelectionChanged;
	private CellContextMenuHandler onCellContextMenu;
	private RangeSelectionChangedHandler onRangeSelectionChanged;
	private CellValueChangedHandler onCellValueChanged;
	private RowValueChangedHandler onRowValueChanged;
	private CellEditingStartedHandler onCellEditingStarted;
	private CellEditingStoppedHandler onCellEditingStopped;
	private RowEditingStartedHandler onRowEditingStarted;
	private RowEditingStoppedHandler onRowEditingStopped;
	private SortChangedHandler onSortChanged;
	private FilterChangedHandler onFilterChanged;
	private FilterModifiedHandler onFilterModified;
	private RowDragEnterHandler onRowDragEnter;
	private RowDragMoveHandler onRowDragMove;
	private RowDragLeaveHandler onRowDragLeave;
	private RowDragEndHandler onRowDragEnd;
	private ColumnVisibleHandler onColumnVisible;
	private ColumnPinnedHandler onColumnPinned;
	private ColumnResizedHandler onColumnResized;
	private ColumnMovedHandler onColumnMoved;
	private ColumnRowGroupChangedHandler onColumnRowGroupChanged;
	private ColumnValueChangedHandler onColumnValueChanged;
	private ColumnPivotModeChangedHandler onColumnPivotModeChanged;
	private ColumnPivotChangedHandler onColumnPivotChanged;
	private NewColumnsLoadedHandler onNewColumnsLoaded;
	private GridColumnsChangedHandler onGridColumnsChanged;
	private DisplayedColumnsChangedHandler onDisplayedColumnsChanged;
	private VirtualColumnsChangedHandler onVirtualColumnsChanged;
	private ColumnEverythingChangedHandler onColumnEverythingChanged;
	private GridReadyHandler onGridReady;
	private GridSizeChangedHandler onGridSizeChanged;
	private ModelUpdatedHandler onModelUpdated;
	private FirstDataRendereredHandler onFirstDataRendered;
	private RowGroupOpenedHandler onRowGroupOpened;
	private ExpandCollapseAllHandler onExpandOrCollapseAll;
	private PaginationChangedHandler onPaginationChanged;
	private PinnedRowDataChangedHandler onPinnedRowDataChanged;
	private VirtualRowRemovedHandler onVirtualRowRemoved;
	private ViewportChangedHandler onViewportChanged;
	private BodyScrollHandler onBodyScroll;
	private DragStartedHandler onDragStarted;
	private DragStoppedHandler onDragStopped;
	private RowDataChangedHandler onRowDataChanged;
	private RowDataUpdatedHandler onRowDataUpdated;
	private ToolPanelVisibleChangedHandler onToolPanelVisibleChanged;
	private ComponentStateChangedHandler onComponentStateChanged;
	private AnimationQueueEmptyHandler onAnimationQueueEmpty;
	private CellKeyDownHandler onCellKeyDown;
	private CellKeyPressHandler onCellKeyPress;

	@JsFunction
	public interface GetRowNodeId<T> {
		String getRowNodeId(T item);
	}

	@JsFunction
	public interface RowHeight<T> {
		int getRowHeight(AGGridParams<T> params);
	}

	@JsOverlay
	public final void setGetRowHeight(RowHeight<T> getRowHeight) {
		this.getRowHeight = getRowHeight;
	}

	@JsOverlay
	public final boolean isSuppressPropertyNamesCheck() {
		return suppressPropertyNamesCheck;
	}

	@JsOverlay
	public final void setSuppressPropertyNamesCheck(boolean suppressPropertyNamesCheck) {
		this.suppressPropertyNamesCheck = suppressPropertyNamesCheck;
	}

	@JsOverlay
	public final GridApi<T> getGridApi() {
		return api;
	}

	@JsOverlay
	public final void setGridApi(GridApi<T> api) {
		this.api = api;
	}

	@JsOverlay
	public final JsArray<ColumnDefinition<T>> getColumnDefs() {
		return columnDefs;
	}

	@JsOverlay
	public final void setColumnDefs(JsArray<ColumnDefinition<T>> columnDefs) {
		this.columnDefs = columnDefs;
	}

	@JsOverlay
	public final JsArray<T> getRowData() {
		return rowData;
	}

	@JsOverlay
	public final void setRowData(JsArray<T> rowData) {
		this.rowData = rowData;
	}

	@JsOverlay
	public final ColumnApi<T> getColumnApi() {
		return columnApi;
	}

	@JsOverlay
	public final void setColumnApi(ColumnApi<T> columnApi) {
		this.columnApi = columnApi;
	}

	@JsOverlay
	public final String getRowModelType() {
		return rowModelType;
	}

	@JsOverlay
	public final void setRowModelType(String rowModelType) {
		this.rowModelType = rowModelType;
	}

	@JsOverlay
	public final DataSource<T> getDatasource() {
		return datasource;
	}

	@JsOverlay
	public final void setDatasource(DataSource<T> datasource) {
		this.datasource = datasource;
	}

	@JsOverlay
	public final int getCacheBlockSize() {
		return cacheBlockSize;
	}

	@JsOverlay
	public final void setCacheBlockSize(int cacheBlockSize) {
		this.cacheBlockSize = cacheBlockSize;
	}

	@JsOverlay
	public final JsPropertyMap<Object> getComponents() {
		return components;
	}

	@JsOverlay
	public final void setComponents(JsPropertyMap<Object> components) {
		this.components = components;
	}

	@JsOverlay
	public final boolean isAnimateRows() {
		return animateRows;
	}

	@JsOverlay
	public final void setAnimateRows(boolean animateRows) {
		this.animateRows = animateRows;
	}

	@JsOverlay
	public final boolean isPagination() {
		return pagination;
	}

	@JsOverlay
	public final void setPagination(boolean pagination) {
		this.pagination = pagination;
	}

	@JsOverlay
	public final int getPaginationPageSize() {
		return paginationPageSize;
	}

	@JsOverlay
	public final void setPaginationPageSize(int paginationPageSize) {
		this.paginationPageSize = paginationPageSize;
	}

	@JsOverlay
	public final boolean isDebug() {
		return debug;
	}

	@JsOverlay
	public final void setDebug(boolean debug) {
		this.debug = debug;
	}

	@JsOverlay
	public final int getCacheOverflowSize() {
		return cacheOverflowSize;
	}

	@JsOverlay
	public final void setCacheOverflowSize(int cacheOverflowSize) {
		this.cacheOverflowSize = cacheOverflowSize;
	}

	@JsOverlay
	public final int getMaxConcurrentDatasourceRequests() {
		return maxConcurrentDatasourceRequests;
	}

	@JsOverlay
	public final void setMaxConcurrentDatasourceRequests(int maxConcurrentDatasourceRequests) {
		this.maxConcurrentDatasourceRequests = maxConcurrentDatasourceRequests;
	}

	@JsOverlay
	public final int getInfiniteInitialRowCount() {
		return infiniteInitialRowCount;
	}

	@JsOverlay
	public final void setInfiniteInitialRowCount(int infiniteInitialRowCount) {
		this.infiniteInitialRowCount = infiniteInitialRowCount;
	}

	@JsOverlay
	public final int getMaxBlocksInCache() {
		return maxBlocksInCache;
	}

	@JsOverlay
	public final void setMaxBlocksInCache(int maxBlocksInCache) {
		this.maxBlocksInCache = maxBlocksInCache;
	}

	@JsOverlay
	public final void setGetRowNodeId(GetRowNodeId<T> getRowNodeId) {
		this.getRowNodeId = getRowNodeId;
	}

	@JsOverlay
	public final RowSelection getRowSelection() {
		return rowSelection;
	}

	@JsOverlay
	public final void setRowSelection(String rowSelection) {
		RowSelection selection = new RowSelection();
		selection.setMode(rowSelection);
		setRowSelection(selection);
	}

	@JsOverlay
	public final void setRowSelection(RowSelection rowSelection) {
		this.rowSelection = rowSelection;
	}

	@JsOverlay
	public final int getRowHeight() {
		return rowHeight;
	}

	@JsOverlay
	public final void setRowHeight(int rowHeight) {
		this.rowHeight = rowHeight;
	}

	@JsOverlay
	public final boolean isSuppressCellSelection() {
		return suppressCellSelection;
	}

	@JsOverlay
	public final void setSuppressCellSelection(boolean suppressCellSelection) {
		this.suppressCellSelection = suppressCellSelection;
	}

	@JsOverlay
	public final boolean isSuppressRowClickSelection() {
		return suppressRowClickSelection;
	}

	@JsOverlay
	public final void setSuppressRowClickSelection(boolean suppressRowClickSelection) {
		this.suppressRowClickSelection = suppressRowClickSelection;
	}

	@JsOverlay
	public final void setOnCellClicked(CellClickedHandler onCellClicked) {
		this.onCellClicked = onCellClicked;
	}

	@JsOverlay
	public final void setOnCellDoubleClicked(CellDoubleClickedHandler onCellDoubleClicked) {
		this.onCellDoubleClicked = onCellDoubleClicked;
	}

	@JsOverlay
	public final void setOnCellFocused(CellFocusedHandler onCellFocused) {
		this.onCellFocused = onCellFocused;
	}

	@JsOverlay
	public final void setOnCellMouseOver(CellMouseOutHandler onCellMouseOver) {
		this.onCellMouseOver = onCellMouseOver;
	}

	@JsOverlay
	public final void setOnCellMouseOut(CellMouseOutHandler onCellMouseOut) {
		this.onCellMouseOut = onCellMouseOut;
	}

	@JsOverlay
	public final void setOnCellMouseDown(CellMouseDownHandler onCellMouseDown) {
		this.onCellMouseDown = onCellMouseDown;
	}

	@JsOverlay
	public final void setOnRowClicked(RowClickedHandler onRowClicked) {
		this.onRowClicked = onRowClicked;
	}

	@JsOverlay
	public final void setOnRowDoubleClicked(RowDoubleClickedHandler onRowDoubleClicked) {
		this.onRowDoubleClicked = onRowDoubleClicked;
	}

	@JsOverlay
	public final void setOnRowSelected(RowSelectedHandler onRowSelected) {
		this.onRowSelected = onRowSelected;
	}

	@JsOverlay
	public final void setOnSelectionChanged(SelectionChangedHandler onSelectionChanged) {
		this.onSelectionChanged = onSelectionChanged;
	}

	@JsOverlay
	public final void setOnCellContextMenu(CellContextMenuHandler onCellContextMenu) {
		this.onCellContextMenu = onCellContextMenu;
	}

	@JsOverlay
	public final void setOnRangeSelectionChanged(RangeSelectionChangedHandler onRangeSelectionChanged) {
		this.onRangeSelectionChanged = onRangeSelectionChanged;
	}

	@JsOverlay
	public final void setOnCellValueChanged(CellValueChangedHandler onCellValueChanged) {
		this.onCellValueChanged = onCellValueChanged;
	}

	@JsOverlay
	public final void setOnRowValueChanged(RowValueChangedHandler onRowValueChanged) {
		this.onRowValueChanged = onRowValueChanged;
	}

	@JsOverlay
	public final void setOnCellEditingStarted(CellEditingStartedHandler onCellEditingStarted) {
		this.onCellEditingStarted = onCellEditingStarted;
	}

	@JsOverlay
	public final void setOnCellEditingStopped(CellEditingStoppedHandler onCellEditingStopped) {
		this.onCellEditingStopped = onCellEditingStopped;
	}

	@JsOverlay
	public final void setOnRowEditingStarted(RowEditingStartedHandler onRowEditingStarted) {
		this.onRowEditingStarted = onRowEditingStarted;
	}

	@JsOverlay
	public final void setOnRowEditingStopped(RowEditingStoppedHandler onRowEditingStopped) {
		this.onRowEditingStopped = onRowEditingStopped;
	}

	@JsOverlay
	public final void setOnSortChanged(SortChangedHandler onSortChanged) {
		this.onSortChanged = onSortChanged;
	}

	@JsOverlay
	public final void setOnFilterChanged(FilterChangedHandler onFilterChanged) {
		this.onFilterChanged = onFilterChanged;
	}

	@JsOverlay
	public final void setOnFilterModified(FilterModifiedHandler onFilterModified) {
		this.onFilterModified = onFilterModified;
	}

	@JsOverlay
	public final void setOnRowDragEnter(RowDragEnterHandler onRowDragEnter) {
		this.onRowDragEnter = onRowDragEnter;
	}

	@JsOverlay
	public final void setOnRowDragMove(RowDragMoveHandler onRowDragMove) {
		this.onRowDragMove = onRowDragMove;
	}

	@JsOverlay
	public final void setOnRowDragLeave(RowDragLeaveHandler onRowDragLeave) {
		this.onRowDragLeave = onRowDragLeave;
	}

	@JsOverlay
	public final void setOnRowDragEnd(RowDragEndHandler onRowDragEnd) {
		this.onRowDragEnd = onRowDragEnd;
	}

	@JsOverlay
	public final void setOnColumnVisible(ColumnVisibleHandler onColumnVisible) {
		this.onColumnVisible = onColumnVisible;
	}

	@JsOverlay
	public final void setOnColumnPinned(ColumnPinnedHandler onColumnPinned) {
		this.onColumnPinned = onColumnPinned;
	}

	@JsOverlay
	public final void setOnColumnResized(ColumnResizedHandler onColumnResized) {
		this.onColumnResized = onColumnResized;
	}

	@JsOverlay
	public final void setOnColumnMoved(ColumnMovedHandler onColumnMoved) {
		this.onColumnMoved = onColumnMoved;
	}

	@JsOverlay
	public final void setOnColumnRowGroupChanged(ColumnRowGroupChangedHandler onColumnRowGroupChanged) {
		this.onColumnRowGroupChanged = onColumnRowGroupChanged;
	}

	@JsOverlay
	public final void setOnColumnValueChanged(ColumnValueChangedHandler onColumnValueChanged) {
		this.onColumnValueChanged = onColumnValueChanged;
	}

	@JsOverlay
	public final void setOnColumnPivotModeChanged(ColumnPivotModeChangedHandler onColumnPivotModeChanged) {
		this.onColumnPivotModeChanged = onColumnPivotModeChanged;
	}

	@JsOverlay
	public final void setOnColumnPivotChanged(ColumnPivotChangedHandler onColumnPivotChanged) {
		this.onColumnPivotChanged = onColumnPivotChanged;
	}

	@JsOverlay
	public final void setOnNewColumnsLoaded(NewColumnsLoadedHandler newColumnsLoaded) {
		this.onNewColumnsLoaded = newColumnsLoaded;
	}

	@JsOverlay
	public final void setOnGridColumnsChanged(GridColumnsChangedHandler onGridColumnsChanged) {
		this.onGridColumnsChanged = onGridColumnsChanged;
	}

	@JsOverlay
	public final void setOnDisplayedColumnsChanged(DisplayedColumnsChangedHandler onDisplayedColumnsChanged) {
		this.onDisplayedColumnsChanged = onDisplayedColumnsChanged;
	}

	@JsOverlay
	public final void setOnVirtualColumnsChanged(VirtualColumnsChangedHandler onVirtualColumnsChanged) {
		this.onVirtualColumnsChanged = onVirtualColumnsChanged;
	}

	@JsOverlay
	public final void setOnColumnEverythingChanged(ColumnEverythingChangedHandler onColumnEverythingChanged) {
		this.onColumnEverythingChanged = onColumnEverythingChanged;
	}

	@JsOverlay
	public final void setOnGridReady(GridReadyHandler onGridReady) {
		this.onGridReady = onGridReady;
	}

	@JsOverlay
	public final void setOnGridSizeChanged(GridSizeChangedHandler onGridSizeChanged) {
		this.onGridSizeChanged = onGridSizeChanged;
	}

	@JsOverlay
	public final void setOnModelUpdated(ModelUpdatedHandler onModelUpdated) {
		this.onModelUpdated = onModelUpdated;
	}

	@JsOverlay
	public final void setOnFirstDataRendered(FirstDataRendereredHandler onFirstDataRendered) {
		this.onFirstDataRendered = onFirstDataRendered;
	}

	@JsOverlay
	public final void setOnRowGroupOpened(RowGroupOpenedHandler onRowGroupOpened) {
		this.onRowGroupOpened = onRowGroupOpened;
	}

	@JsOverlay
	public final void setOnExpandOrCollapseAll(ExpandCollapseAllHandler onExpandOrCollapseAll) {
		this.onExpandOrCollapseAll = onExpandOrCollapseAll;
	}

	@JsOverlay
	public final void setOnPaginationChanged(PaginationChangedHandler onPaginationChanged) {
		this.onPaginationChanged = onPaginationChanged;
	}

	@JsOverlay
	public final void setOnPinnedRowDataChanged(PinnedRowDataChangedHandler onPinnedRowDataChanged) {
		this.onPinnedRowDataChanged = onPinnedRowDataChanged;
	}

	@JsOverlay
	public final void setOnVirtualRowRemoved(VirtualRowRemovedHandler onVirtualRowRemoved) {
		this.onVirtualRowRemoved = onVirtualRowRemoved;
	}

	@JsOverlay
	public final void setOnViewportChanged(ViewportChangedHandler onViewportChanged) {
		this.onViewportChanged = onViewportChanged;
	}

	@JsOverlay
	public final void setOnBodyScroll(BodyScrollHandler onBodyScroll) {
		this.onBodyScroll = onBodyScroll;
	}

	@JsOverlay
	public final void setOnDragStarted(DragStartedHandler onDragStarted) {
		this.onDragStarted = onDragStarted;
	}

	@JsOverlay
	public final void setOnDragStopped(DragStoppedHandler onDragStopped) {
		this.onDragStopped = onDragStopped;
	}

	@JsOverlay
	public final void setOnRowDataChanged(RowDataChangedHandler onRowDataChanged) {
		this.onRowDataChanged = onRowDataChanged;
	}

	@JsOverlay
	public final void setOnRowDataUpdated(RowDataUpdatedHandler onRowDataUpdated) {
		this.onRowDataUpdated = onRowDataUpdated;
	}

	@JsOverlay
	public final void setOnToolPanelVisibleChanged(ToolPanelVisibleChangedHandler onToolPanelVisibleChanged) {
		this.onToolPanelVisibleChanged = onToolPanelVisibleChanged;
	}

	@JsOverlay
	public final void setOnComponentStateChanged(ComponentStateChangedHandler onComponentStateChanged) {
		this.onComponentStateChanged = onComponentStateChanged;
	}

	@JsOverlay
	public final void setOnAnimationQueueEmpty(AnimationQueueEmptyHandler onAnimationQueueEmpty) {
		this.onAnimationQueueEmpty = onAnimationQueueEmpty;
	}

	@JsOverlay
	public final void setOnCellKeyDown(CellKeyDownHandler onCellKeyDown) {
		this.onCellKeyDown = onCellKeyDown;
	}

	@JsOverlay
	public final void setOnCellKeyPress(CellKeyPressHandler onCellKeyPress) {
		this.onCellKeyPress = onCellKeyPress;
	}

	@JsOverlay
	public final SelectionColumnDef getSelectionColumnDef() {
		return selectionColumnDef;
	}

	@JsOverlay
	public final void setSelectionColumnDef(SelectionColumnDef selectionColumnDef) {
		this.selectionColumnDef = selectionColumnDef;
	}
}
