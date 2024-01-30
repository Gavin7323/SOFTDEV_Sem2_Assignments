import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {

        Console console = System.console();

        String programmingLanguage = console.readLine("Enter your favorite language: ");
        System.out.println(programmingLanguage);

        char[] password = console.readPassword("Enter your password: ");
        console.printf("%s\n", new String(password));
        console.printf("%.2f\n", 3.1415);

        double pi = 3.14159265;
        double roundedPi = round(pi, 3);
        System.out.println(roundedPi);

        double negativePi = -3.14159265;
        double negativeRoundedPi = round(negativePi, 3);
        System.out.println(negativeRoundedPi);
    }

    public static double round(double number, int decimalPoint) {
        double sign = Math.signum(number);
        number = Math.abs(number);
        number *= Math.pow(10, decimalPoint);
        number += 0.5;
        number = Math.floor(number);
        number /= Math.pow(10, decimalPoint);
        return sign * number;
    }
}