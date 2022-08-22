package com.work.effectivejava.item3;

import java.util.HashMap;

public enum CacheSingletone implements Cache{


    INSTANCE;


    private HashMap<Object, Object> map = new HashMap<Object,Object>();
    @Override
    public void put(Object key, Object value) {

        map = new HashMap<Object,Object>();

    }

    @Override
    public Object get(Object key) {
        return  map.get(key);
    }
}
