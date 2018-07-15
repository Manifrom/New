package week8day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSinglehwitspaces {

	public static void main(String[] args) {
		
		String text = "$125 3  6257";
		String all2 = text.replaceAll("\\s+", " ");
		System.out.println(all2);
	}
}
