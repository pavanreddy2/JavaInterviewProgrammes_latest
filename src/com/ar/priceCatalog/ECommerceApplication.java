package com.ar.priceCatalog;

public class ECommerceApplication {
    public static void main(String[] args) {
        // Initialize the price catalog and cart service
        PriceCatalog priceCatalog = new PriceCatalog();
        priceCatalog.initilizeCatalog();

        CartService cartService = new CartService(priceCatalog);

        // Add items to the cart
        cartService.addItemToCart(Item.APPLE, 2);
        cartService.displayCart();

        // Remove an item from the cart
        cartService.displayCart();

        // Calculate and display total cart value
        int totalValue = cartService.calculateTotalCartValue();
        System.out.println("Total cart value: " + totalValue + " INR");
    }
}
