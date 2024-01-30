java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        try (Scanner input = new Scanner(System.in)){
            
            System.out.println("Enter a number");
            String number1 = input.next();
            System.out.println("Enter another nuber");
            String number2 = input.next();
            int number1Int = 0;
            int number2Int = 0;

            try{
                try{
                    number1Int = Integer.parseInt(number1);
                }catch (Exception ex){
                    number1Int = 0;
                    throw new IntegerException("number1 is not an int");
                }
                try{
                    number2Int = Integer.parseInt(number2);
                }catch (Exception ex){
                    number2Int = 0;
                    throw new IntegerException("number2 is not an int");

            }catch(IntegerException intEX){
                System.out.println(number1Int * number2Int)
            }
        }
=======
        Property<Double> number1 = new Property<Double>(3.0);
        Property<Double> number2 = new Property<Double>(2.0);

        System.out.println("number1 > number2" + number1.isGreaterThan(number2));
        System.out.println("number1 > number2" + number1.isLessThan(number2));
        //TODO:  repeat for equals, notequals, greaterThanorequals, less than or equals

>>>>>>> 296e114d0dd1d71e63e523e1a1e644ceb1a1bf15
    }
}