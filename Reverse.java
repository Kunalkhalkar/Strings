/*
Q6. Write a program to reverse a given string.
 Input : Java
 Output : avaJ
*/
import java.util.*;
public class Reverse{
	public static void main(String ...x){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		char ch[] = s.toCharArray();	
		for(int i= 0, j=ch.length-1; i <ch.length/2; i++, j--){
			 char temp = ch[i];
			 ch[i] = ch[j];
			 ch[j]= temp;
		}
		String abs = new String(ch);
		System.out.println(abs);
	}
}