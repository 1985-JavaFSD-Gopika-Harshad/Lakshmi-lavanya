public class Container<T> {
    private T item;

    public Container() {
    }

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

    public static void main(String[] args) {
        
        Container<String> stringContainer = new Container<>();
        stringContainer.set("Sun rises in the East");
        System.out.println("String value: " + stringContainer.get());

        Container<Integer> intContainer = new Container<>();
        intContainer.set(89);
        System.out.println("Integer value: " + intContainer.get());
    }
}
