class Solution {
    public int solution(String my_string) {
        int answer = 0;
			String a;	// a를 담다줄 String
			a = my_string.toLowerCase();	// a를 소문자로 변환	
			a.toCharArray();	// a를 char[]로 변환
			for(int i = 97; i <= 122; i++) {	// 소문자 a~z의 아스키코드
				a = a.replaceAll(Character.toString((char) i),"");	// 해당 아스키코드의 문자는 다 없애기, String타입으로 변환	
			}
			String[] oo = new String[a.length()];
			
			int[] g = new int[a.length()];
			for(int j = 0; j < a.length();j++) {
				oo[j] = String.valueOf(a.charAt(j));
				g[j] = Integer.parseInt(oo[j]);
				answer += g[j];
			}	
			return answer;
    }
}