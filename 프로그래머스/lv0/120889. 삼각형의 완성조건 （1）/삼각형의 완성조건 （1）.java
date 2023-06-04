import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
			Arrays.sort(sides);
			int max = sides[2];
			int as[] = new int[2];
			as[0] = sides[0];
			as[1] = sides[1];
			
			if(as[0]+as[1] <= max) {
				answer = 2;
			}else {
				answer = 1;
			}
			return answer;
    }
}