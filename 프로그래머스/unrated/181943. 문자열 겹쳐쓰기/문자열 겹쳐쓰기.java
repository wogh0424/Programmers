class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
       String answer = "";
			int as = my_string.length();
			int aas = overwrite_string.length();
			int bb = aas + s;
			String test = "";
			String test1 = "";
			test = my_string.substring(bb,as);
			answer += my_string.substring(0,s);
			answer += overwrite_string + test;

			
			return answer;
    }
}