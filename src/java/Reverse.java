package java;

public class Reverse {
	public static void main(String[] args) {
		String line="1 2 3   7 3 ";
		line = line.replaceAll(" ", "");
		int strLen = line.length();
		int[] arr = new int[strLen];
		for(int j=0; j<strLen; j++) {
			arr[j] = Character.getNumericValue(line.charAt(strLen-j-1));
		}
		for(int j=0; j<strLen; j++) {
			System.out.println(arr[j]);
		}
	}
}
