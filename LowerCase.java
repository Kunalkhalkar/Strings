/*
Q9. Write a program to convert a string into lowercase.
 Input : HELLO
 Output : hello
*/
import java.util.*;
public class LowerCase{
	public static void main(String ...x){
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder stb = new StringBuilder("");
		for(int i=0; i<str.length(); i++){
			char ch = (char)((int)(str.charAt(i)+32));
			stb.append(ch);
		}
		System.out.println(stb);
	}
}