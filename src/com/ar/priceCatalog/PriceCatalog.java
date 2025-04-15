package com.ar.priceCatalog;

import java.util.HashMap;
import java.util.Map;

public class PriceCatalog {

    private Map<String, Integer> priceCatalog = new HashMap<>();

    //Add an Item to the price Catalog
    public void initilizeCatalog() {
        for (Item item: Item.values()) {
            priceCatalog.put(item.getName(),item.getPrice());
        }
    }

    //Get price of an Item
    public int getItem(String item) {
        return priceCatalog.getOrDefault(item,0);
    }

    //check item exist in a Catalog
    public boolean checkItem(Item item) {
        return priceCatalog.containsKey(item);
    }
}
