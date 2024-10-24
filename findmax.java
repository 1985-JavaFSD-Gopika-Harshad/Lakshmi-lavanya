public class Genericmaxfinder {

 
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null");
        }

        T max = array[0];  
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element; 
            }
        }
        return max;
    }

    public static void main(String[] args) {
       
        Integer[] intArray = {1, 7, 6, 9, 4};
        System.out.println("Max Integer: " + findMax(intArray));

      
        String[] strArray = {"apple", "pearl", "star", "grapes"};
        System.out.println("Max String: " + findMax(strArray));
    }
}
