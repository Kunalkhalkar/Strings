/*Q11. Write a program to print the first character of a string.
 Input : Apple
 Output : A
*/
import java.util.*;
public class PrintString{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println(str.charAt(0));
	}
}