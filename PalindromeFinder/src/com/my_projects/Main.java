package com.my_projects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word/statement/number ");
        String input = scanner.nextLine();
        String palindromeNumber = "";

        for (int i = 0; i < input.length(); i++) {
            palindromeNumber = input.charAt(i) + palindromeNumber;
        }
        System.out.println(input.equals(palindromeNumber) ? (input + " is a palindrome") : (input + " is not a palindrome"));

    }
}
