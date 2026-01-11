/*
String 2
*/
import java.util.*;
public class StringTwo{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int count =0;
		for(int i = 0; i<s.length(); i++){
			count++;
		}
		System.out.println("The length of string '"+s +"' is : "+ count);
	}
	
}
