class Solution {
    public String solution(String my_string, int n) {
       		String answer = "";
			int as = 0;		
			as = my_string.length() - n;
			System.out.println(as);
			return answer = my_string.substring(as,my_string.length());
    }
}