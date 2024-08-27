class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++){
            int count = numberCnt(i);
            // 약수의 갯수가 공격력 제한 수치를 넘을경우    
            if(count > limit){
                answer += power;
            }
            // 약수의 갯수가 공격력 제한 수치랑 같거나 작은경우
            else{
                answer += count;
            }
        }
        return answer;
    }
    
    // 약수의 갯수를 판별하는 메소드
    private int numberCnt(int number){
        int count = 0;
        for(int i = 1; i <= Math.sqrt(number); i++){
            if(number % i == 0) {
                count++;
                
                // 예시로 number가 36일때 약수인 1을 찾으면, 36도 바로 찾음
                if(i != number / i){
                    count++;
                }
            }
        }
        return count;
    }
}