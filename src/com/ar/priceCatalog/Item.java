package com.ar.priceCatalog;

public enum Item {
    APPLE("apple",10);

    private final String name;
    private final int price;

    //Constructor
    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // Get item by name
    public static Item getItemByName(String itemName) {
        for (Item item : Item.values()) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null; // Return null if the item does not exist
    }
}
