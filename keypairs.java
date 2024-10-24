public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }
    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair [first=" + first + ", second=" + second + "]";
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(1, "one");
        System.out.println("Initial Pair: " + pair1);

        System.out.println("First: " + pair1.getFirst());
        System.out.println("Second: " + pair1.getSecond());

        pair1.setFirst(2);
        pair1.setSecond("two");

        System.out.println("Updated Pair: " + pair1);
    }
}
