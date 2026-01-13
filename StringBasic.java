/*
Q3. Write a program to count total characters in a string (excluding spaces).
 Input : Java Language
 Output : 12
*/
import java.util.*;
public class StringBasic{
	public static void main(String ...x){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String s = sc.nextLine();
	int count = 0;
	for(int i=0; i<s.length(); i++){
		if(s.charAt(i) == ' '){
			continue;
		}
		
		++count;
	}
	System.out.println(count);
	}
}