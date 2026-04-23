/*
Q11. Write a Java program to count special characters.
Description:Count characters which are not alphabets and digits.
Input:Enter string: java@123#
Output:Special characters are: 2
*/
import java.io.*;

public class countSpChar{
	public static void main(String ...x)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String with special chars");
		String str = br.readLine();
		
		int count =0;
		for(int i = 0; i<str.length(); i++){
			str = str.toLowerCase();
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){
				continue;
			}
				count++;
		}
		System.out.println(count);
	}
}