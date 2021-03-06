package com.vaadin.elements.grid.selection;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsExport;
import com.google.gwt.core.client.js.JsNamespace;
import com.google.gwt.core.client.js.JsType;
import com.vaadin.client.widget.grid.selection.SelectionModel;
import com.vaadin.elements.common.js.JS;
import com.vaadin.elements.common.js.JSArray;

/**
 * Selection model based on row indexes.
 */
@JsNamespace(JS.VAADIN_JS_NAMESPACE + ".grid._api")
@JsExport
@JsType
public interface IndexBasedSelectionModel extends SelectionModel<Object> {

    /**
     * Deselects an index.
     */
    boolean deselect(int index, boolean skipOwnEvents);

    /**
     * Selects an index.
     */
    boolean select(int index, boolean skipOwnEvents);

    /**
     * Returns an array mapped from the selected indexes.
     */
    JSArray<Object> selected(JavaScriptObject mapper, Integer from, Integer to);

    /**
     * Returns an array mapped from the deselected indexes.
     */
    JSArray<Object> deselected(JavaScriptObject mapper, Integer from, Integer to);

    /**
     * Returns the count of selected items.
     */
    int size();

    /**
     * Selects all selections.
     */
    void selectAll();

    /**
     * Clears all selections.
     */
    void clear();

    /**
     * Returns the selection mode.
     */
    IndexBasedSelectionMode getMode();

    /**
     * Notified the selection model of updated data size.
     */
    void dataSizeUpdated(int newSize);

}
