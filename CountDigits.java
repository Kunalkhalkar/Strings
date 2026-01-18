/*Q15. Write a program to count digits in a string.
 Input : abc123
 Output : 3
*/
import java.util.*;
public class CountDigits{
	public static void main(String ...x){
		int count=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		for(int i=0; i<s.length(); i++){
			if((int)(s.charAt(i)) >47 && (int)(s.charAt(i)) < 58){
				++count;
			}
		}
		System.out.println("the digits Present in String is : "+count);
	}
}