/*
Q6. Write a Java program to convert string into uppercase without using inbuilt function.
Description:Accept a string and convert lowercase letters into uppercase using ASCII logic.
Input:Enter string: java
Output:Uppercase string: JAVA
*/
import java.io.*;
public class ToUpperCaseString{
	public static void main(String...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i< str.length(); i++){
			char ch = str.charAt(i);
			
			if(ch >= 95 && ch <= 122){
				sb.append((char)(ch - 32));
			}
			else
			{
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}
}