class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int num = num_list.length - 1;
        
        int index = 0;
        for(int i = num; i!=-1; i--){
            answer[index] = num_list[i]; 
             index++; 
        }
        return answer;
    }
}