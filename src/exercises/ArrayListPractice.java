package exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class ArrayListPractice {

    private static int sumOfEvens(ArrayList<Integer> someInts) {
        int sum = 0;

        for (int i : someInts) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    private static ArrayList<String> printWords(ArrayList<String> someWords, int wordLength) {
        ArrayList<String> rightLength = new ArrayList<>();

        for (String word : someWords) {
            if (word.length() == wordLength) {
                rightLength.add(word);
            }
        }
        if (rightLength.size() > 0) {
            return (rightLength);
        } else {
            rightLength.add("There are no words of that length in this list.");
            return rightLength;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> someInts = new ArrayList<>();
        ArrayList<String> someWords = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String newPhrase = phrase.replaceAll("\\p{Punct}", "");
        String str[] = newPhrase.split(" ");
        List<String> phraseList;
        phraseList = Arrays.asList(str);
        someWords.addAll(phraseList);

        someInts.add(28);
        someInts.add(11);
        someInts.add(1);
        someInts.add(9);
        someInts.add(62);
        someInts.add(7);
        someInts.add(3);
        someInts.add(18);
        someInts.add(4);
        someInts.add(2);

        int result = sumOfEvens(someInts);
        System.out.println(result);

        System.out.println("What word length would you like to search for? ");
        int wordLength = input.nextInt();

        System.out.println(printWords(someWords, wordLength));
        input.close();
    }
}
