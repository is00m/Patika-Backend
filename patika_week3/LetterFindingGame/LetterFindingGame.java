package LetterFindingGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterFindingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> letters = new ArrayList<>(List.of("i", "s", "o", "m"));

        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + ". Harfi giriniz : ");
            String letter = input.nextLine();

            boolean found = false;
            for (int j = 0; j < letters.size(); j++) {
                if (letters.get(j).equals(letter)) {
                    letters.set(j, "found");
                    found = true;
                    break;
                }
            }
            if (!found) {
                letters.add(letter);
            }
        }
        System.out.println(letters);
    }
}