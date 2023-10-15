import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringManipulationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Select an operation (1-36):");
        System.out.println("1. Reverse String");
        System.out.println("2. Palindrome");
        System.out.println("3. Vowel and consonant count");
        System.out.println("4. No of occurrence of pattern in string");
        System.out.println("5. No of words");
        System.out.println("6. Sorting");
        System.out.println("7. Anagram");
        System.out.println("8. Change two strings");
        System.out.println("9. Capitalize first letter");
        System.out.println("10. Validate if a string contains only alphabetic characters");
        System.out.println("11. Remove duplicate characters");
        System.out.println("12. Remove digits");
        System.out.println("13. Count occurrences of each character");
        System.out.println("14. Print ASCII code of each character");
        System.out.println("15. Print Upper case characters");
        System.out.println("16. Count Lower case characters");
        System.out.println("17. Create new string with digits first and then characters");
        System.out.println("18. Remove spaces in a string");
        System.out.println("19. Reverse the case of string");
        System.out.println("20. Pig Latin");
        System.out.println("21. Encoding (shift characters by 2)");
        System.out.println("22. First character of each word");
        System.out.println("23. First 2 characters of each word");
        System.out.println("24. Print word starting with a particular letter or string");
        System.out.println("25. Print word ending with a particular letter or string");
        System.out.println("26. Print word containing a particular letter or string");
        System.out.println("27. Print words with a particular number of characters");
        System.out.println("28. Print string with special characters");
        System.out.println("29. Find longest word");
        System.out.println("30. Find a particular word");
        System.out.println("31. Count number of words");
        System.out.println("32. Count number of words ending with a particular letter");
        System.out.println("33. Change a word with another");
        System.out.println("34. Delete a word");
        System.out.println("35. Change case of word");
        System.out.println("36. Swap first and last letter of each word");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                // Reverse String
                String reversedString = new StringBuilder(inputString).reverse().toString();
                System.out.println("Reversed String: " + reversedString);
                break;

            case 2:
                // Palindrome
                if (isPalindrome(inputString)) {
                    System.out.println("Palindrome: Yes");
                } else {
                    System.out.println("Palindrome: No");
                }
                break;

            case 3:
                // Vowel and consonant count
                int[] counts = countVowelsAndConsonants(inputString);
                System.out.println("Vowels: " + counts[0]);
                System.out.println("Consonants: " + counts[1]);
                break;

            case 4:
                // No of occurrences of pattern in string
                System.out.print("Enter a pattern to search: ");
                String pattern = scanner.nextLine();
                int occurrences = countPatternOccurrences(inputString, pattern);
                System.out.println("Occurrences of '" + pattern + "': " + occurrences);
                break;

            case 5:
                // No of words
                int wordCount = countWords(inputString);
                System.out.println("Number of words: " + wordCount);
                break;

            case 6:
                // Sorting
                String sortedString = sortString(inputString);
                System.out.println("Sorted String: " + sortedString);
                break;

            case 7:
                // Anagram
                System.out.print("Enter another string for anagram check: ");
                String secondString = scanner.nextLine();
                if (areAnagrams(inputString, secondString)) {
                    System.out.println("Anagrams: Yes");
                } else {
                    System.out.println("Anagrams: No");
                }
                break;

            case 8:
                // Change two strings
                System.out.print("Enter the first string: ");
                String firstString = scanner.nextLine();
                System.out.print("Enter the second string: ");
                String secondStr = scanner.nextLine();
                System.out.print("Enter the target string: ");
                String targetStr = scanner.nextLine();
                String resultString = changeTwoStrings(inputString, firstString, secondStr, targetStr);
                System.out.println("Updated String: " + resultString);
                break;

            case 9:
                // Capitalize first letter
                String capitalizedString = capitalizeFirstLetter(inputString);
                System.out.println("Capitalized String: " + capitalizedString);
                break;

            case 10:
                // Validate if a string contains only alphabetic characters
                if (containsOnlyAlphabetic(inputString)) {
                    System.out.println("Contains only alphabetic characters: Yes");
                } else {
                    System.out.println("Contains only alphabetic characters: No");
                }
                break;

            case 11:
                // Remove duplicate characters
                String deduplicatedString = removeDuplicateCharacters(inputString);
                System.out.println("Deduplicated String: " + deduplicatedString);
                break;

            case 12:
                // Remove digits
                String noDigitsString = removeDigits(inputString);
                System.out.println("String with digits removed: " + noDigitsString);
                break;

            case 13:
                // Count occurrences of each character
                countCharacterOccurrences(inputString);
                break;

            case 14:
                // Print ASCII code of each character
                printASCIICodes(inputString);
                break;

            case 15:
                // Print Upper case characters
                String upperCaseChars = getUpperCaseCharacters(inputString);
                System.out.println("Upper case characters: " + upperCaseChars);
                break;

            case 16:
                // Count Lower case characters
                int lowerCaseCount = countLowerCaseCharacters(inputString);
                System.out.println("Lower case characters count: " + lowerCaseCount);
                break;

            case 17:
                // Create new string with digits first and then characters
                String digitsFirstString = digitsFirstCharactersLater(inputString);
                System.out.println("String with digits first: " + digitsFirstString);
                break;

            case 18:
                // Remove spaces in a string
                String noSpacesString = removeSpaces(inputString);
                System.out.println("String with spaces removed: " + noSpacesString);
                break;

            case 19:
                // Reverse the case of string
                String reversedCaseString = reverseCase(inputString);
                System.out.println("String with reversed case: " + reversedCaseString);
                break;

            case 20:
                // Pig Latin
                String pigLatinString = convertToPigLatin(inputString);
                System.out.println("Pig Latin: " + pigLatinString);
                break;

            case 21:
                // Encoding (shift characters by 2)
                String encodedString = encodeString(inputString);
                System.out.println("Encoded String: " + encodedString);
                break;

            case 22:
                // Print the first character of each word
                printFirstCharacterOfEachWord(inputString);
                break;

            case 23:
                // Print the first 2 characters of each word
                printFirstTwoCharactersOfEachWord(inputString);
                break;

            case 24:
                // Print a word starting with a particular letter or string
                System.out.print("Enter the starting letter or string: ");
                String startStr = scanner.nextLine();
                printWordsStartingWith(inputString, startStr);
                break;

            case 25:
                // Print word ending with a particular letter or string
                System.out.print("Enter the ending letter or string: ");
                String endStr = scanner.nextLine();
                printWordsEndingWith(inputString, endStr);
                break;

            case 26:
                // Print word containing a particular letter or string
                System.out.print("Enter the letter or string to find: ");
                String searchStr = scanner.nextLine();
                printWordsContaining(inputString, searchStr);
                break;

            case 27:
                // Print words with a particular number of characters
                System.out.print("Enter the number of characters: ");
                int charCount = scanner.nextInt();
                printWordsWithCharCount(inputString, charCount);
                break;

            case 28:
                // Printing string with special characters
                printStringWithSpecialChars(inputString);
                break;

            case 29:
                // Find longest word
                String longestWord = findLongestWord(inputString);
                System.out.println("Longest Word: " + longestWord);
                break;

            case 30:
                // Find a particular word
                System.out.print("Enter the word to find: ");
                String wordToFind = scanner.nextLine();
                if (containsWord(inputString, wordToFind)) {
                    System.out.println("Word found: Yes");
                } else {
                    System.out.println("Word found: No");
                }
                break;

            case 31:
                // Count number of words
                int wordCount1 = countWords(inputString);
                System.out.println("Number of words: " + wordCount1);
                break;

            case 32:
                // Count number of words ending with a particular letter
                System.out.print("Enter the ending letter to count: ");
                String endingLetter = scanner.nextLine();
                int endingLetterCount = countWordsEndingWith(inputString, endingLetter);
                System.out.println("Number of words ending with '" + endingLetter + "': " + endingLetterCount);
                break;

            case 33:
                // Change a word with another
                System.out.print("Enter the word to change: ");
                String wordToChange = scanner.nextLine();
                System.out.print("Enter the new word: ");
                String newWord = scanner.nextLine();
                String changedString = changeWord(inputString, wordToChange, newWord);
                System.out.println("Updated String: " + changedString);
                break;

            case 34:
                // Delete a word
                System.out.print("Enter the word to delete: ");
                String wordToDelete = scanner.nextLine();
                String stringWithWordDeleted = deleteWord(inputString, wordToDelete);
                System.out.println("String with word deleted: " + stringWithWordDeleted);
                break;

            case 35:
                // Change case of word
                System.out.print("Enter the word to change case: ");
                String wordToChangeCase = scanner.nextLine();
                String stringWithCaseChanged = changeCaseOfWord(inputString, wordToChangeCase);
                System.out.println("String with case changed: " + stringWithCaseChanged);
                break;

            case 36:
                // Swap first and last letter of each word
                String stringWithSwappedLetters = swapFirstAndLastLetters(inputString);
                System.out.println("String with swapped letters: " + stringWithSwappedLetters);
                break;

            default:
                System.out.println("Invalid choice. Please enter a valid option (1-36).");
        }

        scanner.close();
    }

    // Utility methods for various string operations

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to count vowels and consonants in a string
    private static int[] countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        int[] counts = {vowels, consonants};
        return counts;
    }

    // Method to count occurrences of a pattern in a string
    private static int countPatternOccurrences(String str, String pattern) {
        int count = 0;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        while (m.find()) {
            count++;
        }
        return count;
    }

    // Method to count words in a string
    private static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    // Method to sort the characters in a string
    private static String sortString(String str) {
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }

    // Method to check if two strings are anagrams
    private static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);
        return java.util.Arrays.equals(charArray1, charArray2);
    }

    // Method to change two strings with a target string
    private static String changeTwoStrings(String str, String firstStr, String secondStr, String targetStr) {
        str = str.replaceAll(firstStr, targetStr);
        str = str.replaceAll(secondStr, targetStr);
        return str;
    }

    // Method to capitalize the first letter of each word in a string
    private static String capitalizeFirstLetter(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }

    // Method to check if a string contains only alphabetic characters
    private static boolean containsOnlyAlphabetic(String str) {
        return str.matches("^[a-zA-Z]+$");
    }

    // Method to remove duplicate characters from a string
    private static String removeDuplicateCharacters(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    // Method to remove digits from a string
    private static String removeDigits(String str) {
        return str.replaceAll("\\d", "");
    }

    // Method to count occurrences of each character in a string
    private static void countCharacterOccurrences(String str) {
        int[] counts = new int[256]; // Assuming ASCII characters
        for (char c : str.toCharArray()) {
            counts[c]++;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println("Character '" + (char) i + "': " + counts[i]);
            }
        }
    }

    // Method to print ASCII codes of each character in a string
    private static void printASCIICodes(String str) {
        for (char c : str.toCharArray()) {
            int ascii = (int) c;
            System.out.println("Character '" + c + "': ASCII Code " + ascii);
        }
    }

    // Method to get upper case characters from a string
    private static String getUpperCaseCharacters(String str) {
        StringBuilder upperCaseChars = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseChars.append(c);
            }
        }
        return upperCaseChars.toString();
    }

    // Method to count lower case characters in a string
    private static int countLowerCaseCharacters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                count++;
            }
        }
        return count;
    }

    // Method to create a new string with digits first and then characters
    private static String digitsFirstCharactersLater(String str) {
        StringBuilder digits = new StringBuilder();
        StringBuilder characters = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            } else if (Character.isLetter(c)) {
                characters.append(c);
            }
        }
        return digits.toString() + characters.toString();
    }

    // Method to remove spaces from a string
    private static String removeSpaces(String str) {
        return str.replaceAll(" ", "");
    }

    // Method to reverse the case of characters in a string
    private static String reverseCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }

    // Method to convert a string to Pig Latin
    private static String convertToPigLatin(String str) {
        String[] words = str.split(" ");
        StringBuilder pigLatinStr = new StringBuilder();

        for (String word : words) {
            char firstChar = Character.toLowerCase(word.charAt(0));
            if ("aeiou".indexOf(firstChar) >= 0) {
                pigLatinStr.append(word).append("way ");
            } else {
                pigLatinStr.append(word.substring(1)).append(word.charAt(0)).append("ay ");
            }
        }

        return pigLatinStr.toString().trim();
    }

    // Method to encode a string by shifting characters by 2 positions
    private static String encodeString(String str) {
        StringBuilder encodedStr = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char newChar = (char) (c + 2);
                if ((Character.isLowerCase(c) && newChar > 'z') ||
                        (Character.isUpperCase(c) && newChar > 'Z')) {
                    newChar -= 26;
                }
                encodedStr.append(newChar);
            } else {
                encodedStr.append(c);
            }
        }
        return encodedStr.toString();
    }

    // Method to print the first character of each word in a sentence
    private static void printFirstCharacterOfEachWord(String str) {
        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word.charAt(0));
            }
        }
    }

    // Method to print the first 2 characters of each word in a sentence
    private static void printFirstTwoCharactersOfEachWord(String str) {
        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                if (word.length() >= 2) {
                    System.out.println(word.substring(0, 2));
                } else {
                    System.out.println(word);
                }
            }
        }
    }

    // Method to print words starting with a particular letter or string
    private static void printWordsStartingWith(String str, String start) {
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.startsWith(start)) {
                System.out.println(word);
            }
        }
    }

    // Method to print words ending with a particular letter or string
    private static void printWordsEndingWith(String str, String end) {
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.endsWith(end)) {
                System.out.println(word);
            }
        }
    }

    // Method to print words containing a particular letter or string
    private static void printWordsContaining(String str, String search) {
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.contains(search)) {
                System.out.println(word);
            }
        }
    }

    // Method to print words with a particular number of characters
    private static void printWordsWithCharCount(String str, int charCount) {
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.length() == charCount) {
                System.out.println(word);
            }
        }
    }

    // Method to print a string with special characters
    private static void printStringWithSpecialChars(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                System.out.print(c);
            }
        }
        System.out.println();
    }

    // Method to find the longest word in a sentence
    private static String findLongestWord(String str) {
        String[] words = str.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    // Method to check if a string contains a particular word
    private static boolean containsWord(String str, String word) {
        return str.contains(word);
    }

    // Method to count words ending with a particular letter
    private static int countWordsEndingWith(String str, String endLetter) {
        String[] words = str.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.endsWith(endLetter)) {
                count++;
            }
        }
        return count;
    }

    // Method to change a word with another in a string
    private static String changeWord(String str, String wordToChange, String newWord) {
        return str.replaceAll("\\b" + wordToChange + "\\b", newWord);
    }

    // Method to delete a word in a string
    private static String deleteWord(String str, String wordToDelete) {
        return str.replaceAll("\\b" + wordToDelete + "\\b", "");
    }

    // Method to change the case of a word in a string
    private static String changeCaseOfWord(String str, String wordToChangeCase) {
        if (str.contains(wordToChangeCase)) {
            String lowerCaseWord = wordToChangeCase.toLowerCase();
            String upperCaseWord = wordToChangeCase.toUpperCase();
            return str.replaceAll("\\b" + wordToChangeCase + "\\b", Character.isLowerCase(wordToChangeCase.charAt(0)) ? lowerCaseWord : upperCaseWord);
        } else {
            return str;
        }
    }

    // Method to swap the first and last letter of each word in a string
    private static String swapFirstAndLastLetters(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 1) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                word = last + word.substring(1, word.length() - 1) + first;
            }
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }
}
