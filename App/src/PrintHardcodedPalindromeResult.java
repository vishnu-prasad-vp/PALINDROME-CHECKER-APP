public class PrintHardcodedPalindromeResult {

        public static void main(String[] args) {
            // Hardcoded string to check
            String word = "madam";

            // Reverse the string
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            // Check if original and reversed strings are equal
            if (word.equals(reversed)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }

}
