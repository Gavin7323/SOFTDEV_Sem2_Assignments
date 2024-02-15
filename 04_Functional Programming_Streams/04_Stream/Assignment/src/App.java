<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
=======
import java.util.List;
>>>>>>> 46ee1d328df8dbe3632085763cd7f88deb3150b3

public class App {
    public static void main(String[] args) throws Exception {

<<<<<<< HEAD
         List<Integer> myNumbersList = new ArrayList<>();
         myNumbersList.add(3);
         myNumbersList.add(4);
         myNumbersList.add(5);
         List<Integer> myNumberAdd3List = new ArrayList<>();
         for(var number : myNumbersList){
         myNumberAdd3List.add(number + 3);
         }

         Stream<Integer> myNumbersStream = myNumbersList.stream();
         Stream<Integer> myNumbersEmptyStream = Stream.empty();

         Function<Integer, Integer> add3 = (number) -> number + 3;

         Stream<Integer> myNumbersAdd3Stream = myNumbersStream.map(add3);
         var list1 = myNumbersAdd3Stream.toList();
         System.out.println(list1);

         Stream<String> myStringStream = Stream.of("a", "b", "c");

         System.out.println(myStringStream.toList());

         List<String> myStringList = List.of(
             "One",
                "OneAndOnly",
                "Derek",
               "Change",
               "factory",
                "justBefore",
               "Italy",
               "Italy",
              "Thursday",
              "",
              "");

      Stream<String> filteredStream = myStringList.stream().filter((element) -> element.contains("d"));
   System.out.println(filteredStream.toList());

    boolean hasLowerD = myStringList.stream().anyMatch((element) -> element.contains("d"));
  System.out.println(hasLowerD);

  boolean allHasLowerD = myStringList.stream().allMatch((element) -> element.contains("d"));
   System.out.println(allHasLowerD);

        boolean someDontHaveLowerD = myStringList.stream().noneMatch((element) -> element.contains("d"));
     System.out.println(someDontHaveLowerD);

        List<Double> myDoubles = List.of(1.0, 2.0, 3.0);
        myDoubles.stream().forEachOrdered((num) -> System.out.println(num));
=======
        List<Integer> myList = List.of(1, 2, 3);

        Integer cumulativeSum = myList.stream().reduce(0, (a, b) -> a + b );
        System.out.println(cumulativeSum);
        
        Integer cumulativeProduct = myList.stream().reduce(1, (a, b) -> a * b);

        //create  a list of strings.  
        //fill that list with your daily school schedule
        //write a Function<String, String> toLowerCase
        //the function will equal (s) -> s.toLowerCase();
        //map your list of strings to another list of strings using 
        //.stream().map(toLowerCase).toList(); and set to a variable called lowerCaseSchedule
        //System.out.println(your lower cased list)

>>>>>>> 46ee1d328df8dbe3632085763cd7f88deb3150b3

    }
}