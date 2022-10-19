package com.work.effectivejava.item29;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DataBaseRow {

    private Map<Column<?>, Objects> columns = new HashMap<Column<?>, Objects>();

    public <T> void putColumn(Column<T> type, T instance){

        if(type==null)
            throw new NullPointerException("Type is Null");

        // Achieving runtime type safety with a dynamic cast
        // Same trick can be found in the following implementations
        // checkedSet, checkedList, checkedMap, and so forth.
        columns.put(type, (Objects) instance.getClass().cast(instance));
    }

    public <T>  T getColumn(Column<T> type){

        return type.cast(columns.get(type));
    }

}
