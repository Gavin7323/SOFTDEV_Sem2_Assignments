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



    }
}