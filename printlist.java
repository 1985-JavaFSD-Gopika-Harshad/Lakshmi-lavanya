import java.util.List;

public class BoundedTypeExample {

    // Method that takes a list of elements extending Number and prints each element
    public static void printList(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        System.out.println("Integer List:");
        printList(intList);

        System.out.println("\nDouble List:");
        printList(doubleList);
    }
}
