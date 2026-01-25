/*Q23. Split the string into words and find the word with maximum length.
 Input : Java is very powerful
 Output : powerful
*/
import java.util.*;

public class SplitString {
    public static void main(String ...x) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        StringBuilder currentWord = new StringBuilder();
        String longestWord = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch != ' ') {
                currentWord.append(ch);
            } else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord.toString();
                }
                currentWord.setLength(0); // reset for next word
            }
        }

        // check last word
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord.toString();
        }

        System.out.println("Word with maximum length: " + longestWord);
        System.out.println("Length is: " + longestWord.length());
    }
}
