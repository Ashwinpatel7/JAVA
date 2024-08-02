public class string8 {
    public static void main(String[] args) {
        // Input string
        String str = "aaaabbbccddde";

        // Initialize the result string with the first character of the input string
        String ans = "" + str.charAt(0);

        // Initialize a counter for consecutive characters
        int count = 1;

        // Loop through the input string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // Get the current and previous characters
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            // Check if the current character is the same as the previous one
            if (curr == prev) {
                // If yes, increment the counter
                count++;
            } else {
                // If no, append the count (if greater than 1) and the current character to the result string
                if (count > 1)
                    ans += count;
                count = 1;  // Reset the counter
                ans += curr;  // Append the current character to the result string
            }
        }

        // Append the count (if greater than 1) for the last set of consecutive characters
        if (count > 1)
            ans += count;

        // Print the final result
        System.out.println(ans);
    }
}
