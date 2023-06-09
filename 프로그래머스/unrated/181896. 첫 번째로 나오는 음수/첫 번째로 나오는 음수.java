class Solution {
    public int solution(int[] num_list) {
       		int answer = 0;
		int a = -1;
		String[] test = new String[num_list.length];
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] < 0) {
				a = i;
				break;
			} else {
				a = -1;
			}
		}
		return answer = a;
    }
}