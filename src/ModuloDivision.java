import javax.swing.*;

public class ModuloDivision {
// Written by: Mike Baldwin
// Takes a user inputted triple number and adds prints the sum of the digits

public static void main(String[] args) {
    int number, sum, digit;

    sum = 0;
    number = Integer.parseInt(JOptionPane.showInputDialog(
            null,
            "Enter an integer",
            "Modulo Division",
            JOptionPane.QUESTION_MESSAGE));

    while (number > 0) {
        digit = number % 10;
        number /= 10;
        sum += digit;
    }

    JOptionPane.showMessageDialog(null, "The sum of the digits is: " + sum);
}
}
