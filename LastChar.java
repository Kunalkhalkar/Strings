/*Q12. Write a program to print the last character of a string.
 Input : India
 Output : a
*/
import java.util.*;
public class LastChar{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println(str.charAt(str.length()-1));
	}
}