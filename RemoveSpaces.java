/*
Q16. Write a program to remove all spaces from a string.
 Input : Java Programming
 Output : JavaProgramming
*/
import java.util.*;
public class RemoveSpaces{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
			
		StringBuilder sb = new StringBuilder();
		String st[] = str.split(" ");
		for(String s : st){
			sb.append(s);
		}
		System.out.println("String without space '"+sb+"'");
	}
}