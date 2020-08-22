package exercises;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] someInts = {1, 1, 2, 3, 5, 8};

        for (int i : someInts) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] phraseArraySpace = phrase.split(" ");
        System.out.println(Arrays.toString(phraseArraySpace));

        String[] phraseArraySentence = phrase.split("\\.");
        System.out.println(Arrays.toString(phraseArraySentence));
    }
}
