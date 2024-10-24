public class Box<T> {
    private T object;  

    public Box(T object) {
        this.object = object;
    }

       public void displayInfo() {
        if (object != null) {
            System.out.println("Type: " + object.getClass().getName());
            System.out.println("Value: " + object.toString());
        } else {
            System.out.println("Empty");
        }
    }

      public T getObject() {
        return object;
    }

        public void setObject(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
      
        Box<Integer> intBox = new Box<>(111);
        intBox.displayInfo();

       
        Box<String> strBox = new Box<>("Revature");
        strBox.displayInfo();

        Box<Double> doubleBox = new Box<>(10.10);
        doubleBox.displayInfo();
    }
}
