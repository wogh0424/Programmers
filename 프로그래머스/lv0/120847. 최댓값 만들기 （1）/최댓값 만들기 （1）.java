import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int second = 0;
        
        Arrays.sort(numbers);
        
        max = numbers[numbers.length-1];
        second = numbers[numbers.length-2];
        return answer = max * second;
    }
}