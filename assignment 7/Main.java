// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to convert to Pig Latin: ");
        String inputWord = scanner.nextLine();

        String pigLatinWord = convertToPigLatin(inputWord);

        System.out.println("The converted word in PigLatin: " + pigLatinWord);
        }

public static String convertToPigLatin(String word) {
        if (word.length() == 0) {
        return "";
        }

        char firstChar = word.charAt(0);

        if (isVowel(firstChar)) {
        return word + "ay";
        } else {
        int index = 0;
        while (index < word.length() && !isVowel(word.charAt(index))) {
        index++;
        }
        return word.substring(index) + word.substring(0, index) + "ay";
        }
        }

public static boolean isVowel(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char vowel : vowels) {
        if (c == vowel) {
        return true;
        }
        }
        return false;
        }
        }