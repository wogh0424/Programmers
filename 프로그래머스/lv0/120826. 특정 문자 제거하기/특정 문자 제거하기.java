import java.util.*;
class Solution { // replace를 사용하면 2줄짜리 문제임
    public String solution(String my_string, String letter) {
        String answer = "";
		String[] list = new String[my_string.length()];
		ArrayList<String> list1 = new ArrayList<String>();
		for(int i = 0; i < my_string.length();i++) {
			list[i] = String.valueOf(my_string.charAt(i));
			list1.add(list[i]);
			if(list[i].equals(letter)) {
				list1.remove(list[i]);
			}
		}	
		String a = String.join("",list1);
		answer = a;
		return answer;
    }
}