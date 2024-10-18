public class GenericSwap {
    // Generic swap method
    public static <T> void swap(T[] array) {
        if (array == null || array.length < 2) {
            return; // No swap needed if array is null or has less than two elements
        }
        
        // Swap the first and last elements
        T temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }

    public static void main(String[] args) {
        // Sample usage with an Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        
        swap(intArray); // Perform swap
        
        System.out.println("\nAfter swap: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }

        // Sample usage with a String array
        String[] strArray = {"apple", "banana", "cherry"};
        System.out.println("\n\nBefore swap: ");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
        
        swap(strArray); // Perform swap
        
        System.out.println("\nAfter swap: ");
        for (String str : strArray) {
            System.out.print(str + " ");
        }
    }
}
