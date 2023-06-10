import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String abb = "";
		char[] as = a.toCharArray();
		for (Character c : as) {
			if (Character.isLowerCase(c)) {
				abb += Character.toUpperCase(c);
			} else {
				abb += Character.toLowerCase(c);
			}

		}
		System.out.println(abb);
	}
}
