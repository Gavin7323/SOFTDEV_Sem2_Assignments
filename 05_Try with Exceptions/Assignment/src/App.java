import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        try (Scanner input = new Scanner(System.in)){
            
            System.out.println("Enter a number");
            String number1 = input.next();
            System.out.println("Enter another nuber");
=======
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Enter a number");
            String number1 = input.next();
            System.out.println("Enter another number");
>>>>>>> c87069e08c290c481884d39da585a03c70e35289
            String number2 = input.next();
            int number1Int = 0;
            int number2Int = 0;

<<<<<<< HEAD
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
=======
            try {
                try {
                    number1Int = Integer.parseInt(number1);
                } catch (Exception ex) {
                    number1Int = 0;
                    throw new IntegerException("number1 is not an int");
                }
                try {
                    number2Int = Integer.parseInt(number2);
                } catch (Exception ex) {
                    number2Int = 0;
                    throw new IntegerException("number2 is not an int");
                }

            } catch (IntegerException intEX) {
                System.out.println(intEX.getMessage());
            }
            System.out.println(number1Int * number2Int);

>>>>>>> c87069e08c290c481884d39da585a03c70e35289
        }
    }
}
