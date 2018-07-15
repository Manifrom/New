package week8day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurences {

	public static void main(String[] args) {
		String company = "Cognizant Technology solution";
		company = company.toLowerCase();
		//company = company.toUpperCase();
		//System.out.println(company);
		char[] charArray = company.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char eachChar : charArray) {
			System.out.print(eachChar);
			if(map.containsKey(eachChar)) {
				map.put(eachChar, map.get(eachChar)+1);
			}else {
				map.put(eachChar, 1);
				
			}

		}
		System.out.print(map);


	}

}
