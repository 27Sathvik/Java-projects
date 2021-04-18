package com.my_projects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.next();
        while (true) {
            try {
                int foo = Integer.parseInt(number);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Try again!Enter a number : ");
                number = scanner.next();
            }
        }
        String[] single_digit_numbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] double_digit_numbers = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "eighteen", "nineteen"};
        String[] multiples_of_ten = {"", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String number_name = "";

        for (int i = 0; i <= number.length() - 1; i++) {
            int digit = Character.getNumericValue(number.charAt(i)) - 1;

            if ((i == number.length() - 1 || i == number.length() - 4 || i == number.length() - 6 || i == number.length() - 8) && number.charAt(i) != '0') {
                number_name += single_digit_numbers[digit] + " ";
            }
            if ((i == number.length() - 2 || i == number.length() - 5 || i == number.length() - 7 || i == number.length() - 9) && number.charAt(i) != '0') {
                if (number.charAt(i) == '1') {
                    number_name += double_digit_numbers[Character.getNumericValue(number.charAt(i + 1))];
                    i++; // ignore the next time the loop runs to prevent the single digit number
                }
                number_name += multiples_of_ten[digit] + " ";
            }
            if ((i == number.length() - 3) && number.charAt(i) != '0') {
                number_name += single_digit_numbers[digit] + " hundred ";
            }
            if (i == number.length() - 4 && (number.charAt(i) != '0' || number.charAt(i-1) != '0')) {
                number_name += "thousand ";
            }
            if (i == number.length() - 6 && (number.charAt(i) != '0' || number.charAt(i-1) != '0')) {
                number_name += "lakh ";
            }
            if (i == number.length() - 8 && (number.charAt(i) != '0' || number.charAt(i-1) != '0')) {
                number_name += "crore ";
            }
        }
        System.out.println(number + " in words " + number_name);
    }
}
