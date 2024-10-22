public class Container<T> {
    private T item;

    // Constructor
    public Container() {
    }

    // Method to set the object
    public void set(T item) {
        this.item = item;
    }

    // Method to retrieve the object
    public T get() {
        return this.item;
    }

    public static void main(String[] args) {
        // Example usage
        Container<String> stringContainer = new Container<>();
        stringContainer.set("Hello, World!");
        System.out.println("String value: " + stringContainer.get());

        Container<Integer> intContainer = new Container<>();
        intContainer.set(42);
        System.out.println("Integer value: " + intContainer.get());
    }
}
