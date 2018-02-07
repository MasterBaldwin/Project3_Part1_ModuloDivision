import javax.swing.*;

public class ModuloDivision {
// Written by: Mike Baldwin
// Takes a user inputted triple number and adds prints the sum of the digits

public static void main(String[] args) {
    String tempString;
    int number, sum, digit;

    tempString = JOptionPane.showInputDialog("Enter an integer");
    number = Integer.parseInt(tempString);
    sum = 0;

    while (number > 0) {
        digit = number % 10;
        number /= 10;
        sum += digit;
    }

    JOptionPane.showMessageDialog(null, "The sum of the digits is: " + sum);
}
}
