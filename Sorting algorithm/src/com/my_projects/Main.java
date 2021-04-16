package com.my_projects;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        LinkedList<String> words = new LinkedList<>();

        while (true) {
            System.out.println("Enter a word/number.Type 'end' to stop " + words);
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            words.add(input);
        }
        // cat ,apple ,something
        for (int j = -1; j < words.size() - 1; j++) {
            for (int i = j + 1; i < words.size() - 1; i++) {
                if (words.get(i).charAt(0) > words.get(i + 1).charAt(0)) {
                    String element = words.get(i + 1);
                    words.set(i + 1, words.get(i));
                    words.set(i, element);

                }
            }
            System.out.println(words);
        }

    }
}