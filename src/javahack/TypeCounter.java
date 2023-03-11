package javahack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TypeCounter {

	public static void main(String[] args) {
		int stringCount = 0;
		int integerCount = 0;
		int doubleCount = 0;
		String s = "-3";
		String[] strArr = s.split(" ");
		for(String item: strArr) {
			Pattern doublePattern = Pattern.compile("^(-?)[1-9][0-9]*\\.\\d+$");
			Pattern integerPattern = Pattern.compile("^(-?)[1-9][0-9]*$");
			Pattern stringPattern = Pattern.compile("[^A-Z]+");

			if(doublePattern.matcher(item).matches()) {
				System.out.println("float");
				doubleCount++;
			}
			else if(integerPattern.matcher(item).matches()){
				System.out.println("int");
				integerCount++;
			}
			else if(stringPattern.matcher(item).find()){
				System.out.println("String");
				stringCount++;
			}
			
		}
		System.out.println("string "+stringCount);
        System.out.println("integer "+integerCount);
        System.out.println("double "+doubleCount);
	}
}
