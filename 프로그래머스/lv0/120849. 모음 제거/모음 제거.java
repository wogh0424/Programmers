import java.util.ArrayList;
class Solution {
    public String solution(String my_string) {
        String answer = "";
			String[] list = {"a","e","i","o","u"};
			String[] test = new String[my_string.length()];
			ArrayList<String> list1 = new ArrayList<String>();
			
			// my_string을 String[] 배열타입으로 변환
			for(int a = 0; a < my_string.length(); a++) {
				test[a] = String.valueOf(my_string.charAt(a));
				list1.add(test[a]);
			}
	
			// 동일한 값 찾기
			for(int i = 0; i < my_string.length();i++) {
				for(int j = 0; j < list.length;j++) {					
					if(test[i].equals(list[j])) {
						list1.remove(list[j]);
				}	
				}
			}
			answer = String.join("", list1);
			return answer;
    }
}