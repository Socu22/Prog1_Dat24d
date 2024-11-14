package ExameØvelse;

public class test3 {
    public static void main(String[] args) {
        String str = "how to split a string in java";
        String[] arrOfStr = str.split(" "); // Split the string into words

        String longestWord = ""; // To store the longest word

        // Loop through the array of words
        for (int i = 0; i < arrOfStr.length; i++) {
            if (arrOfStr[i].length() > longestWord.length()) {
                longestWord = arrOfStr[i]; // Update longestWord if current word is longer
            }
        }

        // Print the longest word
        System.out.println("Longest word: " + longestWord);
    }
}
