import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char target;
		
		for(int i = 0; i < a.length(); i++) {
			target = a.charAt(i);
			System.out.println(target);
		}
    }
}