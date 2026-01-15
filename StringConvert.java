/*Q8. Write a program to convert a string into uppercase.
 Input : java
 Output : JAVA
 {not using inbuilt methods}
*/
import java.util.*;
public class StringConvert{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		StringBuilder str1 = new StringBuilder("");
		for(int i =0; i < str.length(); i++){
			char s = str.charAt(i);
			char t = (char)((int)(s-32));
			str1 = str1.append(t);
		}
		
		System.out.println("String is "+ str1);
	}
}
