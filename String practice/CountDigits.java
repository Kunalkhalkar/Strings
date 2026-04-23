/*
Q4. Write a Java program to count total digits in a string.
Description:Accept a string containing characters and numbers and count how many digits are present.
Input:Enter string: abc123xyz45
Output:Total digits are: 5
*/
import java.io.*;
public class CountDigits{
	public static void main(String ...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		
		int count = 0;
		String str = br.readLine();
		
		for(int i = 0; i< str.length(); i++){
			char ch = str.charAt(i);
			if(ch >=48 && ch < 59){
				count++;
			}
				
		}
		System.out.println("Digits in String is : "+ count);
	}
}