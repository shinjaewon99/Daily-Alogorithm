class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // 1. left와 right 매개변수 만큼 반복
        for(int i = left; i <= right; i++){
            int count = 0;
            // 2. 약수의 갯수 판별
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            // 3. 약수의 갯수가 짝수일 경우
            if(count % 2 == 0){
                answer += i;
            }
            // 4. 약수의 갯수가 홀수일 경우
            else{
                answer -= i;
            }
        }
        return answer;
    }
}