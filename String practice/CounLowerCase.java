/*
Q15. Write a Java program to count lowercase letters.
Description:Count lowercase letters present in string.
Input:Enter string: JaVaPro
Output:Lowercase letters: 4
*/
import java.io.*;
public class CounLowerCase{
	public static void main(String ...x) throws Exception{
		System.out.println("Enter the String");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 0;
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
				count++;
			}
		}
		System.out.println("lower Case char : "+ count);
	}
}