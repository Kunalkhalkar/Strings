/*Q23. Split the string into words and find the word with maximum length.
 Input : Java is very powerful
 Output : powerful
*/
import java.util.*;
public class SplitString{
	public static void main(String ...x){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		StringBuilder sn = new StringBuilder();
		int count = 0;
		for(int i = 0; i < str.length(); i++){
		StringBuilder sb = new StringBuilder("");
		count = 0;
			if(str.charAt(i) != ' '){
				sb.append(str.charAt(i));				
			}
			
			else{
				if(sb.length() > count){
					count = sb.length();
					sn = sb;
				}
			}
		}
		System.out.println("String is : "+sn+" Length is : "+count);
	}
}