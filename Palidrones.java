public class Palidrones {
}import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

class Palindromes {
    public static void main(String[] args) throws IOException, NumberFormatException {
        String input, reverse = "";
        boolean isPalindrome = true;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your word: ");
        input = BR.readLine().toLowerCase();

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != reverse.charAt(i))
                isPalindrome = false;
        }

        if (isPalindrome) {
            System.out.println("It is palindrome.");
        } else {
            System.out.println("It is not palindrome.");
        }
    }
}
