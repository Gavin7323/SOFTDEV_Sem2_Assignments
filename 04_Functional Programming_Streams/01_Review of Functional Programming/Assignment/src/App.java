<<<<<<< HEAD
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
=======
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        double cFromOO = lawOfCosinesOO(1, 1, 90);
        double cFromFPDumb = lawOfCosineFPDumb.apply(1.0, 1.0, 90.0);
        var cFromFPSmart = lawOfCosinesSmart.apply(1.0).apply(1.0);
        System.out.println(cFromOO);
        System.out.println(cFromFPDumb);
        System.out.println(cFromFPSmart);
    }

    public static double lawOfCosinesOO(double a, double b, double angDegrees) {
        double angRadians = Math.toRadians(angDegrees);
        double cosinePart = 2 * a * b * Math.cos(angRadians);
        double aSq = a * a;
        double bSq = b * b;
        return Math.sqrt(aSq + bSq - cosinePart);
    }

    public static TriFunction<Double, Double, Double, Double> lawOfCosineFPDumb = (a, b, angDegrees) -> {
        double angRadians = Math.toRadians(angDegrees);
        double cosinePart = 2 * a * b * Math.cos(angRadians);
        double aSq = a * a;
        double bSq = b * b;
        return Math.sqrt(aSq + bSq - cosinePart);
    };
    public static Function<Double, Function<Double, Function<Double, Double>>> lawOfCosinesSmart = (
            a) -> (b) -> (angDegrees) -> {
                double angRadians = Math.toRadians(angDegrees);
                double cosinePart = 2 * a * b * Math.cos(angRadians);
                double aSq = a * a;
                double bSq = b * b;
                return Math.sqrt(aSq + bSq - cosinePart);
            };

    // TODO: write a function called lawOfCosinesAngle
    public static Function<Double, Function<Double, Function<Double, Double>>> lawOfCosinesAngleC = (
            a) -> (b) -> (c) -> {

                //angleC = acos((c^2 - a^2 - b^2) / (-2ab))

            };

}
>>>>>>> 58b53865ed7395bba41e6c43b348fcacd2a9805f
