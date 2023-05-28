class Solution {
    public int solution(String A, String B) {
      		int answer = 0;
		String abs = A;
		
		for(int i = 0; i < abs.length();i++) {
			if(abs.equals(B)) {
				return answer;
			}
			String c = abs.substring(abs.length()-1);	
			abs = c + abs.substring(0,abs.length()-1);	 	
			
			answer++;
		}
		return answer = -1;
	}
}