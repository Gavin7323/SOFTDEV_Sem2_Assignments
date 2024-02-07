import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {

        String name = convertNumberToCarName.apply(0);
        String longName = convertNameToLongName.apply(name);

        // (int -> String)
        var convertNumberToLongName = convertNumberToCarName.andThen(convertNameToLongName);
        convertNumberToLongName.apply(0);

        var convertNumbertoLongName2 = convertNameToLongName.compose(convertNumberToCarName);

    }

    // (int) -> (String)
    public static Function<Integer, String> convertNumberToCarName = (number) -> {
        if (number == 0) {
            return "Chevy";
        } else {
            return "Some Other Car";
        }
    };

    // (string) -> (String)
    public static Function<String, String> convertNameToLongName = (name) -> {
        if (name == "Chevy") {
            return "Chevrolet";
        } else {
            return "Some other Unknown Car Type Name";
        }
    };

    // // (int, String) -> (String)
    // // (int) -> (String) -> (String)
    // public static Function<Integer, Function<String, String>> convertNumberToLongName = (number) -> (shortName) -> {
    //     convertNumberToCarName.apply(null)
        
    // };

    public static Consumer<Integer> consumeInt = (num) -> System.out.println(num);
    public static Supplier<Double> supplyThree = () -> 3.0;
    public static Runnable doSomething = () -> System.out.println("Sleep Painfully");

}