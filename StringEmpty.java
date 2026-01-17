/*
Q14. Write a program to check whether a string is empty or not.
 Input : " "
 Output : String is empty
*/
import java.util.*;
public class StringEmpty{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		if(str.length() < 1){
			System.out.println("String is Empty");
		}
		else{
			System.out.println("String is not Empty");
		}
	}
}