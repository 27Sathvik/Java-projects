package com.my_projects;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word/statement/number ");
        String input = scanner.nextLine();

        Hashtable<Character,Integer> characterCount = new Hashtable<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') { continue; } // ignore any spaces in input

            int counter = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) { counter += 1; } // increases counter variable if char at i = char at j
            }
            characterCount.put(input.charAt(i),counter);
        }
        System.out.println(input + " has " + characterCount.toString().substring(1, characterCount.toString().length() - 1) + " characters");
    }
}
