class Solution {
    public int solution(int[] num_list) {
    int answer = 1;
			int test = 0;
			for(int i = 0; i < num_list.length;i++) {
				if(num_list.length > 10) {
					test += num_list[i];
					answer = test;
				}else {
					answer = answer * num_list[i];				}
			}
			return answer;
    }
}