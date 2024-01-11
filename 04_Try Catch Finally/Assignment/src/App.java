import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("EnterNumber: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter another number: ");
        int secondNumber = input.nextInt();

        int quotient = 0;
        try{
            quotient = firstNumber / secondNumber;
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Defalut answer of 0 used for quotient");
        }finally {
            System.out.println(String.format("The answer from division is %s", quotient));
        }
        input.close();
    }
}
