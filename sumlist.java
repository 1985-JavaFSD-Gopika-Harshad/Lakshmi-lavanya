import java.util.List;

public class WildcardExample {

    public static double sumList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num: list) {
            sum += num.doubleValue(); 
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(7, 8, 9, 4);
        List<Double> doubleList = List.of(4.5, 6.5, 9.5);
        
        System.out.println("Sum of integers: " + sumList(intList));     
        System.out.println("Sum of doubles: " + sumList(doubleList));    
    }
}
