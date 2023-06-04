class Solution {
    public String solution(String my_string) {
       String answer = "";
			char list[] = my_string.toCharArray();
			char[] test = new char[list.length];
			for(int i = my_string.length()-1,j=0; i >=0; i--,j++) {
				test[j] = list[i];
                	
			}
			return answer = String.valueOf(test);
    }
}