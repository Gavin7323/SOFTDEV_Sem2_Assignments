public class App {
    public static void main(String[] args) throws Exception {
        Property<Double> myDoubleProperty = new Property<Double>(3.0);
        Property<Double> myDoubleProperty2 = new Property<Double>(5.0);
        Property<DummyClass> myDummyPropert = new Property<>();
        System.out.println(myDoubleProperty.isGreaterThan(myDoubleProperty2.get()));

    }
}