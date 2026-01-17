/*Q13. Write a program to compare two strings.
 Input: String1- Java, String2- Java
 Output : Strings are equal
 
 //in this code strings are case Sensitive
 
*/
import java.util.*;
public class EqualString{
	public static void main(String...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		
		System.out.println("Enter a String");
		String str2 = sc.next();
		if(str.length() != str2.length()){
			System.out.println("String are not Equal");
		}else{
		char []ch = str.toCharArray();
		char []ch2= str2.toCharArray();
	
		boolean flag = true;
			for(int i=0; i<ch.length; i++){
				if(ch[i] != ch2[i]){
					flag = false;
					break;
				}
			}
			
			if(flag){
				System.out.println("Strings Are Equal");
			}
			
			else{
				System.out.println("Strings Are Not Equal");
			}
		}
	}
}