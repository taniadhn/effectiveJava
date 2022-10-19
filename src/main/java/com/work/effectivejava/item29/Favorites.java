package com.work.effectivejava.item29;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favorites implements FavoriteContract{

    private Map<Class<?>, Objects>  favorites = new HashMap<>();  //Class<?> Joker bir tip kullanıyorum ve diyorum herşey gelebiliyor

    @Override
    public <T> void putFavorite(Class<T> type, T instance) {

        favorites.put(Objects.requireNonNull(type), (Objects) instance);

    }

    @Override
    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }


    public static void main(String[] args) {

        //eğer interface olmasaydı ben bu sınıfın nesnesini şöyle oluşturacaktım.
       // Favorites f = new Favorites();
        //Sadece anlaştığım methodlar üstünden bana erişmesini istiyorum
        FavoriteContract f = new Favorites();
        //Put dediğimde benden bir Class bekliyordu
        f.putFavorite(String.class, "Java");
        f.putFavorite(Integer.class,123);
        f.putFavorite(Class.class, Favorites.class);

        //Çağırırken String doğrudan albiliriz
        String favoriteString = f.getFavorite(String.class);
        int favoriteInteger = f.getFavorite(Integer.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);

        System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());
    }







}
