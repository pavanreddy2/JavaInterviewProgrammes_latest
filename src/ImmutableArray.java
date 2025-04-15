import java.util.Arrays;

public final class ImmutableArray {
    private final int[] items;

    public ImmutableArray(int[] items) {
        // Create a copy of the input array to ensure immutability
        this.items = Arrays.copyOf(items, items.length);
    }
    public int[] getItems() {
        return Arrays.copyOf(items, items.length);
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        ImmutableArray immutableArray = new ImmutableArray(originalArray);
        // Attempt to modify the original array
        originalArray[0] = 99;
        // The internal state of immutableArray remains unchanged
        System.out.println("Original Array: " + Arrays.toString(originalArray)); // Output: [99, 2, 3, 4, 5]
        System.out.println("Immutable Array: " + Arrays.toString(immutableArray.getItems())); // Output: [1, 2, 3, 4, 5]
        // Attempting to modify the immutable array will not affect the original
        int[] retrievedArray = immutableArray.getItems();
        retrievedArray[0] = 100; // This modification does not affect the immutableArray

        System.out.println("After modification attempt on retrieved array:");
        System.out.println("Immutable Array: " + Arrays.toString(immutableArray.getItems())); // Output: [1, 2, 3, 4, 5]
    }
}
