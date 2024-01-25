java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
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
    }
}