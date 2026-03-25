package String;

public class Reverse {
    public static void main(String[] args) {
        String sentence = "my name is manuel";
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");

        for (String word : words) {
            // 1. Record where this word starts in our StringBuilder
            int wordStartIndex = sb.length(); 
            
            // 2. Append the word
            sb.append(word);
            
            // 3. Setup pointers relative to the StringBuilder's buffer
            int lft = wordStartIndex;
            int rht = sb.length() - 1;

            while (lft < rht) {
                // Get characters from the SB buffer
                char leftChar = sb.charAt(lft);
                char rightChar = sb.charAt(rht);

                // Swap them directly in the buffer
                sb.setCharAt(lft, rightChar);
                sb.setCharAt(rht, leftChar);

                lft++;
                rht--;
            }
            
            // 4. Append the space after reversing the word
            sb.append(" ");
        }

        System.out.println("Result: " + sb.toString().trim());
    }
}