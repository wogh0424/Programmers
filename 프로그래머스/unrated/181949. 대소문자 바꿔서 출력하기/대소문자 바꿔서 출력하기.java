import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String abb = "";
		char[] as = a.toCharArray();
		for (int i = 0; i < as.length; i++) {
			if (Character.isLowerCase(as[i])) {
				abb += Character.toUpperCase(as[i]);
			} else {
				abb += Character.toLowerCase(as[i]);
			}

		}
		System.out.println(abb);
	}
}
