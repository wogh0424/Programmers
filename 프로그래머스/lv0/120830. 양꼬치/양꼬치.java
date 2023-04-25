class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int g = 0;
        
        if(n < 10){
           answer = (n * 12000) + (k * 2000);
        }else if(n >= 10){
            if(n / 10 >= 1){
                g = n / 10;
                answer = (n * 12000) + (k * 2000) - (2000*g);
            }

        }
        
        return answer;
    }
}