/*
Q10. Write a Java program to print each character on new line.
Description:Accept a string and display each character separately.
Input:Enter string: Java
Output:
 J
 a
 v
 a
 */
 import java.io.*;
 public class PrintChar{
	 public static void main(String...x) throws Exception{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the String");
		 String str = br.readLine();
		 
		 for(int i=0; i<str.length(); i++){
			 char ch = str.charAt(i);
			 System.out.println(ch);
		 }
	 }
 }