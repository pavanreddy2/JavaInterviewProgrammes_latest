package com.ar.priceCatalog;

import java.util.HashMap;
import java.util.Map;

public class CartService {

    private PriceCatalog priceCatalog;
    private Map<Item,Integer> cart;

    public CartService(PriceCatalog priceCatalog) {
        this.priceCatalog = priceCatalog;
        this.cart = new HashMap<>();
    }

    //add an item to the Cart
    public void addItemToCart(Item item, int quantity) {
        if (priceCatalog.checkItem(item)) {
            cart.put(item,cart.getOrDefault(item,0)+ quantity);
            System.out.println(quantity+ " " + item.getName() + "added to cart..");
        } else {
            System.out.println("Item "+ item.getName()+ "does not exist in the catalog");
        }
    }
    // Method to remove an item from the cart
    public void removeItemFromCart(Item item, int quantity) {
        if (cart.containsKey(item)) {
            int currentQuantity = cart.get(item);
            if (currentQuantity > quantity) {
                cart.put(item, currentQuantity - quantity);
                System.out.println(quantity + " " + item.getName() + "(s) removed from the cart.");
            } else {
                cart.remove(item);
                System.out.println(item.getName() + " removed from the cart.");
            }
        } else {
            System.out.println("Item " + item.getName() + " is not in the cart.");
        }
    }

    // Method to calculate the total cart value
    public int calculateTotalCartValue() {
        int total = 0;
        for (Map.Entry<Item, Integer> entry : cart.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }

    // Method to display cart items
    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Cart Contents:");
        for (Map.Entry<Item, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey().getName() + " - Quantity: " + entry.getValue() +
                    " - Price: " + (entry.getKey().getPrice() * entry.getValue()) + " INR");
        }
    }
}
