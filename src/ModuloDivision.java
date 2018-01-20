import java.util.Scanner;

public class ModuloDivision {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.print("Enter an integer: ");
        number = inputStream.nextInt();

        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            sum += digit;
        }

        System.out.println("The sum of the digits is: " + sum);
    }
}
