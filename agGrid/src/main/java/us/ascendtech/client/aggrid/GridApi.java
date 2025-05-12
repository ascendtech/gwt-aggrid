package us.ascendtech.client.aggrid;

import elemental2.core.JsArray;
import elemental2.core.JsObject;
import elemental2.dom.Element;
import elemental2.dom.EventListener;
import elemental2.dom.MouseEvent;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import us.ascendtech.client.aggrid.events.AgEvent;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class GridApi<T> {

	@JsMethod
	public native void setGridOption(String optionName, Object option);

	/*** Columns ***/
	@JsMethod
	public native void sizeColumnsToFit();

	/*** Data ***/
	@JsMethod
	public native void setRowData(JsArray<T> rowData);

	@JsMethod
	public native void updateRowData(RowDataTransaction rowDataTransaction);

	@JsMethod
	public native JsArray<T> getSelectedNodes();

	@JsMethod
	public native JsArray<T> getSelectedRows();

	@JsMethod
	public native void setDatasource(DataSource<T> dataSource);

	@JsMethod
	public native void setPinnedTopRowData(JsArray<T> rowData);

	@JsMethod
	public native void setPinnedBottomRowData(JsArray<T> rowData);

	@JsMethod
	public native int getPinnedTopRowCount();

	@JsMethod
	public native int getPinnedBottomRowCount();

	@JsMethod
	public native T getPinnedTopRow(int index);

	@JsMethod
	public native T getPinnedBottomRow(int index);

	@JsMethod
	public native T getModel();

	@JsMethod
	public native void refreshClientSideRowModel(AGGridParams<T> params);

	/*** Accessing Row Nodes ***/

	@JsMethod
	public native RowNode<T> getRowNode(String id);

	@JsFunction
	public interface RowNodeHandler<T> {
		void forNode(RowNode<T> node, int index);
	}

	@JsMethod
	public native void forEachNode(RowNodeHandler<T> rowNodeHandler);

	@JsMethod
	public native void forEachNodeAfterFilter(RowNodeHandler<T> rowNodeHandler);

	@JsMethod
	public native void forEachNodeAfterFilterAndSort(RowNodeHandler<T> rowNodeHandler);

	@JsMethod
	public native void forEachLeafNode(RowNodeHandler<T> rowNodeHandler);

	@JsMethod
	public native RowNode<T> getDisplayedRowAtIndex(int rowIndex);

	@JsMethod
	public native int getDisplayRowCount();

	@JsMethod
	public native RowNode<T> getFirstDisplayedRow();

	@JsMethod
	public native RowNode<T> getLastDisplayedRow();

	/*** Selection ***/

	@JsMethod
	public native void selectAll();

	@JsMethod
	public native void deselectAll();

	@JsMethod
	public native void selectAllFiltered();

	@JsMethod
	public native void deselectAllFiltered();

	@JsMethod
	public native JsArray<T> getBestCostNodeSelection();

	/*** Refresh ***/

	@JsMethod
	public native void refreshCells(AGGridParams<T> params);

	@JsMethod
	public native void redrawRows(AGGridParams<T> params);

	@JsMethod
	public native void refreshHeader();

	@JsMethod
	public native void flashCells(AGGridParams<T> params);

	/*** Sort & Filter ***/

	@JsMethod
	public native void setQuickFilter(String quickFilter);

	@JsMethod
	public native boolean isQuickFilterPresent();

	@JsMethod
	public native boolean isColumnFilterPresent();

	@JsMethod
	public native boolean isAnyFilterPresent();

	// TODO: the rest of the filter methods need thorough wrapping of filter objects

	/*** Navigation ***/

	@JsMethod
	public native FocusedCell<T> getFocusedCell();

	@JsMethod
	public native void setFocusedCell(int rowIndex, String colKey, String floating);

	@JsMethod
	public native void clearFocusedCell();

	@JsMethod
	public native void tabToNextCell();

	@JsMethod
	public native void tabToPreviousCell();

	/*** Editing ***/

	@JsMethod
	public native void stopEditing(boolean cancel);

	@JsMethod
	public native void startEditingCell(CellEditorParams<T> params);

	@JsMethod
	public native JsArray<Object> getEditingCells();

	/*** Export ***/

	@JsMethod
	public native void exportDataAsCsv(ExportParams<T> params);

	@JsMethod
	public native void getDataAsCsv(ExportParams<T> params);

	/*** Events ***/

	@JsMethod
	public native void addEventListener(String eventType, EventListener listener);

	@JsMethod
	public native void addGlobalListener(EventListener listener);

	@JsMethod
	public native void removeEventListener(String eventType, EventListener listener);

	@JsMethod
	public native void removeGlobalListener(EventListener listener);

	@JsMethod
	public native void dispatchEvent(AgEvent event);

	@JsMethod
	public native void onFilterChanged();

	/*** Row Groups ***/

	@JsMethod
	public native void expandAll();

	@JsMethod
	public native void colapseAll();

	@JsMethod
	public native void onGroupExpandedOrCollapsed();

	/*** Rendering ***/

	@JsMethod
	public native JsArray<T> getRenderedNodes();

	// TODO: getCellRendererInstances(params) and getCellEditorInstances(params)

	/*** Scrolling ***/

	@JsMethod
	public native void setAlwaysShowVerticalScroll(boolean show);

	@JsMethod
	public native void ensureIndexVisible(int index, String position);

	@JsMethod
	public native void ensureNodeVisible(ColumnDefinition.Comparator<T> comparator, String position);

	@JsMethod
	public native void ensureColumnVisible(String colId);

	@JsMethod
	public native JsObject getHorizontalPixelRange();

	@JsMethod
	public native JsObject getVerticalPixelRange();

	/*** Overlay ***/

	@JsMethod
	public native void showLoadingOverlay();

	@JsMethod
	public native void showNoRowsOverlay();

	@JsMethod
	public native void hideOverlay();

	/*** Pagination ***/

	@JsMethod
	public native boolean paginationIsLastPageFound();

	@JsMethod
	public native int paginationGetPageSize();

	@JsMethod
	public native void paginationSetPageSize(int newPageSize);

	@JsMethod
	public native int paginationGetCurrentPage();

	@JsMethod
	public native int paginationGetTotalPages();

	@JsMethod
	public native int paginationGetRowCount();

	@JsMethod
	public native void paginationGoToPage(int pageNumber);

	@JsMethod
	public native void paginationGoToNextPage();

	@JsMethod
	public native void paginationGoToPreviousPage();

	@JsMethod
	public native void paginationGoToFirstPage();

	@JsMethod
	public native void paginationGoToLastPage();

	/*** Headers ***/

	@JsMethod
	public native void setHeaderHeight(int heightInPx);

	@JsMethod
	public native void setGroupHeaderHeight(int heightInPx);

	@JsMethod
	public native void setFloatingFiltersHeight(int heightInPx);

	@JsMethod
	public native void setPivotHeaderHeight(int heightInPx);

	@JsMethod
	public native void setPivotGroupHeaderHeight(int heightInPx);

	/*** Miscellaneous ***/

	@JsMethod
	public native void setPopupParent(Element element);

	// TODO: addRenderedRowListener(event, rowIndex, callback)

	@JsMethod
	public native void showToolPanel(boolean show);

	@JsMethod
	public native boolean isToolPanelShowing();

	@JsMethod
	public native void doLayout();

	@JsMethod
	public native String getValue(String colKey, RowNode<T> node);

	@JsMethod
	public native void destroy();

	@JsMethod
	public native void showColumnMenuAfterButtonClick(String colKey, Element buttonElement);

	@JsMethod
	public native void showColumnMenuAfterMouseClick(String colKey, MouseEvent mouseEvent);

	@JsMethod
	public native void checkGridSize();

	@JsMethod
	public native void resetRowHeights();

	@JsMethod
	public native void onRowHeightChanged();

	// TODO: addAggFunc(key, aggFunc), addAggFuncs(aggFuncs), clearAggFuncs()

	@JsMethod
	public native void hidePopupMenu();

	@JsMethod
	public native void setSuppressRowDrag(boolean value);

	@JsMethod
	public native void setEnableCellTextSelection();

	@JsMethod
	public native void setGridAutoHeight(boolean value);

	@JsMethod
	public native boolean isAnimationFrameQueueEmpty();

	@JsMethod
	public native void purgeServerSideCache(String route);

	@JsMethod
	public native void resetColumnState();

	@JsMethod
	public native void autoSizeColumns(JsArray<String> colIds);

	@JsMethod
	public native JsArray<ColumnDefinition<T>> getAllDisplayedColumns();

}
