import java.util.List;

public class BoundedTypeExample {

    public static void printList(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(5, 6, 7, 8, 9);
        List<Double> doubleList = List.of(7.1, 9.4, 6.6);

        System.out.println("Integer List:");
        printList(intList);

        System.out.println("\nDouble List:");
        printList(doubleList);
    }
}
