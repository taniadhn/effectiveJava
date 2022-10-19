package com.work.effectivejava.item29;

//API
public interface FavoriteContract {

    public <T> void putFavorite(Class<T> type, T instance);
    public <T> T getFavorite(Class<T> type);


}
