// Define a generic class Pair with two types: T and U
public class Pair<T, U> {
    private T first;
    private U second;

    // Constructor to initialize the pair
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getter method for the first value (of type T)
    public T getFirst() {
        return first;
    }

    // Setter method for the first value (of type T)
    public void setFirst(T first) {
        this.first = first;
    }

    // Getter method for the second value (of type U)
    public U getSecond() {
        return second;
    }

    // Setter method for the second value (of type U)
    public void setSecond(U second) {
        this.second = second;
    }

    // Overriding the toString method for better representation
    @Override
    public String toString() {
        return "Pair [first=" + first + ", second=" + second + "]";
    }

    // Main method to test the Pair class
    public static void main(String[] args) {
        // Creating a Pair of Integer and String
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        System.out.println("Initial Pair: " + pair1);

        // Getting the values
        System.out.println("First: " + pair1.getFirst());
        System.out.println("Second: " + pair1.getSecond());

        // Setting new values
        pair1.setFirst(2);
        pair1.setSecond("Two");

        // Displaying updated values
        System.out.println("Updated Pair: " + pair1);
    }
}
