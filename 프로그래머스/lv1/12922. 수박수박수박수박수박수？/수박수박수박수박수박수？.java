class Solution {
    public String solution(int n) {
        String answer = "";
        
        // 1. 길이 n에 맞춰 패턴 할당하기
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                answer += "수";
            }else{
                answer += "박";
            }
        }
        
        return answer;
    }
}