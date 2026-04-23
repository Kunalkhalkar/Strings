/*
Q7. Write a Java program to convert string into lowercase without using inbuilt function.
Description:Accept a string and convert uppercase letters into lowercase using logic.
Input:Enter string: HELLO
Output:Lowercase string: hello
*/
import java.io.*;

public class ToLowerCase{
	public static void main(String...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i< str.length(); i++){
			char ch = str.charAt(i);
			if(ch >= 65 && ch <=90){
				sb.append((char)(ch +32));
			}
			else{
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}
	
}