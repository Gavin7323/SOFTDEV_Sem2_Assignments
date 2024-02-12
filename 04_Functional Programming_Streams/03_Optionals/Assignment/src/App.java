import java.util.Optional;
import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        //TODO:  make a function called subtract5 using lambda notation
        //TODO: make a function called times5 using lambda notation
        //TODO: make a function called subtract5Times5 using andThen

        //TODO:  create an int called testNumber set to 1;
        //TODO:  apply subtract5Times5 to testNumber


        //Lambda notation examples
        Function<Integer, Integer> add5 = (num) -> num + 5;
        Function<Integer, Integer> div2 = (num) -> num / 2;
        // Function<Integer, Integer> add5Divide2 = (num) -> {
        //     num = num + 5;
        //     num = num / 5;
        //     return num;
        // };

        Function<Integer, Integer> add5Divide2UsingAndThen = add5.andThen(div2);

        Optional<Integer> myIntOption = Optional.of(3);

        Optional<Integer> myIntAdd5Option = myIntOption.map(add5);
        Optional<Integer> myIntAdd5Div2Option = myIntOption.map(add5Divide2UsingAndThen);
        System.out.println(myIntOption);
        System.out.println(myIntAdd5Option);
        System.out.println(myIntAdd5Div2Option);

        Function<Integer, Optional<Integer>> add5Optional = (num) -> Optional.of(num + 5);

        Optional<Integer> myflatmapEmptyExample = Optional.empty();
        var myFlatmapExample = myIntOption.flatMap(add5Optional);
        var myFlatmapExampleExampleTest = myflatmapEmptyExample.flatMap(add5Optional);

        System.out.println(myFlatmapExample);
        System.out.println(myFlatmapExampleExampleTest);

    }

}
