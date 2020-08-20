package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        HashMap<Character, Integer> characterCount = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String quote = input.nextLine().toLowerCase();

        for (int i = 0; i < quote.length(); i++) {
            char character = quote.charAt(i);
            Integer count = characterCount.get(character);
            if (count != null) {
                characterCount.put(character, count + 1);
            } else {
                characterCount.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }

}
