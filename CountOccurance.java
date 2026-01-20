/*
Q19. Write a program to count occurrence of a given character in a string.
  Input: programming, 
 	Character→ g
  Output: 2
*/
import java.util.*;
public class CountOccurance{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String.");
		String str= sc.nextLine();
		System.out.println("Enter the character to find occurance count");
		char c = sc.next().charAt(0);
		int count = findCount(str, c);
		if(count != 0)
			System.out.println("occurance of '"+ c + "' is '"+count+"'");
		else
			System.out.println("Character not found in String '"+str+"'");
		
	}
	
	public static int findCount(String str, char c){
		int count = 0; 
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == c)
				++count;
		}
		return count;
	}
}