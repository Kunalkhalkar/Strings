/*
Q5. Write a Java program to count total spaces in a string.
Description:
 Accept a sentence and count number of blank spaces.
Input:
 Enter string: Java is easy
Output:
 Total spaces are: 2
*/
import java.io.*;

public class countSpaces{
	public static void main(String...x)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String with spaces");
		String str = br.readLine();
		int count = 0;
		
		for(int i = 0; i< str.length(); i++){
		char ch = str.charAt(i);
		if(ch == 32){
			count++;
		}
		}
		System.out.println("Count of Spaces are : "+ count);
		
	}
}