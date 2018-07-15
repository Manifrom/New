package week8day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		
		String text = "ABC@1253$";
		//String pattern = "[a-z]";
		//String pattern = "[0-9]";
		String pattern = "";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		//System.out.println(m.matches());
		//String all = text.replaceAll("[0-9]", "");
		//String all = text.replaceAll("\\D", "");
		String all = text.replaceAll("\\w", "");
		System.out.println(all);
		
		
		
		
	}
}
