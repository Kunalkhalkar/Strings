/*
Q9. Write a Java program to check whether a string is palindrome.
Description:
 Check whether the given string reads the same forward and backward.
Input:Enter string: madam
Output:String is Palindrome
*/
import java.io.*;

public class StringPalindrome{
	public static void main(String...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the String");
		String str = br.readLine();
		
		boolean flag = true;
		for(int i=0, j= str.length()-1; i<j; i++, j--){
			char ch = str.charAt(i), ch1 = str.charAt(j);
			if(ch != ch1){
				System.out.println("Not A palindrome");
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("It is a palindrome string");
		}
		
	}
}