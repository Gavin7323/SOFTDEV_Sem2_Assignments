<<<<<<< HEAD
import java.util.Optional;

import javax.swing.text.html.Option;

public class App {
    public static void main(String[] args) throws Exception {
        Optional<Integer> myIntOptional = Optional.of(3);

        Optional<String> myStringOptional = Optional.of("Hi");
        Optional<String> myEmptyStringOptional = Optional.empty();

        System.out.println(myIntOptional);
        System.out.println(myStringOptional);
        System.out.println(myEmptyStringOptional);

        // str -> str.toLowerCase()
        Optional<String> myStringOptionalLowerCased = myStringOptional.map(str -> str.toLowerCase());
        Optional<String> myStringOptionalLowerCasedEmptyPrinted;

        if (myEmptyStringOptional.isPresent()) {
            myStringOptionalLowerCasedEmptyPrinted = myEmptyStringOptional.map(str -> str.toLowerCase());
        } else {
            myStringOptionalLowerCasedEmptyPrinted = Optional.of("I am NULL");
        }
        System.out.println(myStringOptionalLowerCasedEmptyPrinted);

        var result = myStringOptional.flatMap(str -> {
            if (str == "Hi") {
                return Optional.of(0);
            } else {
                return Optional.empty();
            }
        });


=======
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        // use streams to generate a list of numbers from 0 to 10
        // use streams and Functions with lambdas to make a list with 5 added to each numbers in the ints list
        // use streams and foreach to print out the values

        //What else you need to do.  
        //TODO:  repeate the mapping wtih an extra div2Function and map the list of intsPlus5 to make
        // a list intsPlus5Div2.  
        //TODO:  use foreach to print intsPlus5Div2

        List<Integer> ints = IntStream.rangeClosed(0, 10).boxed().toList();
        Function<Integer, Integer> add5Func = (number) -> number;  //TODO:  acutally implement the lambda correctly

        List<Integer> intsPlus5 = ints.stream().map(add5Func).toList();

        Consumer<Integer> intPrinter = (number) -> System.out.println(number);
        intsPlus5.stream().forEach(intPrinter);

        //TODO:  write a div2Func Function like I did with add5Func
        //TODO:  apply div2Func to intsPlus5 with map
        //TODO:  print with foreach.  
>>>>>>> a8ebb30317b7c067195e81ba69899a14a2a0b466

    }
}