/*
Q3. Write a Java program to count total consonants in a string.
Description:Accept a string and count all consonants excluding vowels and spaces.
Input:Enter string: programming
Output:Total consonants are: 8
*/
import java.util.*;
import java.io.*;

public class CountConsonent{
	public static void main(String...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int count = 0;
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch !='a' || ch !='e' || ch !='i' || ch !='o' || ch !='u' ||){
				count++;
			}
		}
		System.out.println("Count is : "+ count);
	}
}