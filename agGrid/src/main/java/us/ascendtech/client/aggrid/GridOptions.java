package us.ascendtech.client.aggrid;

import elemental2.core.JsArray;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class GridOptions<T> {

	private boolean suppressPropertyNamesCheck;
	private GridApi<T> api;
	private ColumnApi<T> columnApi;
	private JsArray<ColumnDefinition> columnDefs;
	private JsArray<T> rowData;
	private AgReadyEvent<T> agReadyEvent;
	private GridReady<T> gridReady;
	private String rowModelType;
	private DataSource<T> datasource;
	private int cacheBlockSize;
	private JsPropertyMap<Object> components;
	private boolean animateRows;
	private int paginationPageSize;
	private boolean debug;
	private int cacheOverflowSize;
	private int maxConcurrentDatasourceRequests;
	private int infiniteInitialRowCount;
	private int maxBlocksInCache;
	private GetRowNodeId<T> getRowNodeId;
	private String rowSelection;
	private int rowHeight;
	private boolean suppressCellSelection;
	private boolean suppressRowClickSelection;

	@JsFunction
	public interface GetRowNodeId<T> {
		String getRowNodeId(T item);
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
	public final JsArray<ColumnDefinition> getColumnDefs() {
		return columnDefs;
	}

	@JsOverlay
	public final void setColumnDefs(JsArray<ColumnDefinition> columnDefs) {
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
	public final void setAgReadyEvent(AgReadyEvent<T> agReadyEvent) {
		this.agReadyEvent = agReadyEvent;
	}

	@JsOverlay
	public final AgReadyEvent<T> getAgReadyEvent() {
		return agReadyEvent;
	}

	@JsOverlay
	public final void setGridReady(GridReady<T> gridReady) {
		this.gridReady = gridReady;
	}

	@JsOverlay
	public final GridReady<T> getGridReady() {
		return gridReady;
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
	public final String getRowSelection() {
		return rowSelection;
	}

	@JsOverlay
	public final void setRowSelection(String rowSelection) {
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
}
