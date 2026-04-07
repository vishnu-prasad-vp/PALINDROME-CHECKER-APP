// File: UseCase3PalindromeCheckerApp.java

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {
        // Hardcoded string to check
        String original = "racecar";

        // Reverse the string using a for loop
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); // Concatenating characters in reverse
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}