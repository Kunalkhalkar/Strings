/*
Q21. Traverse the string and count how many times each character appears.
 Input : programming
 Output : p=1 r=2 o=1 g=2 a=1 m=2 i=1 n=1
*/
import java.util.*;
public class StringCount{
	public static void main(String...x){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char c : str.toCharArray()) {
			if(c != ' ')
		map.put(c, map.getOrDefault(c, 0) + 1);
	}

	
		
		Set<Character> keys = map.keySet();
		for (Character key : keys) {
			System.out.println("Key: " + key + ", Value: " + map.get(key)); 
		}
		
	}
}