/*Q13. Write a Java program to find the last character of a string.
Description:Accept string and print last character.
Input:Enter string: Laptop
Output:Last character is: p
*/
import java.io.*;
public class LastChar{
	public static void main(String ...x) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = br.readLine();
		
		System.out.println(str.charAt(str.length()-1));
	}
}