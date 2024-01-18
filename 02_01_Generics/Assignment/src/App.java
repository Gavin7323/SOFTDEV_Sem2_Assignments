public class App {
    public static void main(String[] args) throws Exception {

        Property<String> myStringProperty = new Property<String>();
        myStringProperty.set("Hi");
        System.out.println(myStringProperty.get());
        myStringProperty.set("Hello");
        System.out.println(myStringProperty.get());

        Property<Intger> myIntger = new Property<Intger>();
        myIntger.set(3);
        System.out.println(myIntger.get());
        myIntger.set(2);
        System.out.println(myIntger.get());
    }
}
