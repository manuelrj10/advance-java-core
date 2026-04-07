package regexexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternGroup {

	public static void main(String[] args) {
		String text = "bmw: 233,japan: 99,heroshima: 87";
		Matcher matcher = Pattern.compile("\\d+").matcher(text);

		while (matcher.find()) {
			System.out.println("number found " + matcher.group());
		}

	}

}
