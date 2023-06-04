import java.util.*;
class Solution {
    public int solution(int[] sides) {
			Arrays.sort(sides);
			int max = sides[2];
			int as[] = new int[2];
			as[0] = sides[0];
			as[1] = sides[1];
			
			return as[0]+as[1] <= max ? 2 : 1;
    }
}