package lib.grid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class stringReverse {

	public static void main(String[] args) {


		 String Name = "Manikandan";
		 
		char[] charArray = Name.toCharArray();
		int length = Name.length();
		for (int i = length-1; i >= 0; i--) {

			System.out.print(charArray[i]);
		}

		/*for (int i = length-1; i >= 0; i--) {

			System.out.println(Name.charAt(i));
		}

		StringBuilder build = new StringBuilder(Name);
		StringBuilder reverse = build.reverse();
		System.out.println(reverse);
		 */	
		/*Set<Character> unique = new HashSet<Character>();
		{
			char[] charArray = Name.toCharArray();
					{
						for (Character c : charArray) {
							unique.add(c);
						}
						System.out.println(unique);
					}
			}*/

/*		List<Character> unique = new ArrayList<>();
		{
			char[] charArray = Name.toCharArray();
					{
						for (Character c : charArray) {
							if(!unique.contains(c))
							unique.add(c);
						}
						System.out.println(unique);
					}
			}

*/		

	}


}

