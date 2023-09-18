class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        // 1. 시작, 끝 인덱스 지정
        int start = section[0];
        int end = section[0] + (m - 1);
        
        // 2. 시작, 끝 인덱스를 기준으로 할당
        for(int target : section){
            if(target >= start && target <= end) continue;
            
            start = target;
            end = target + (m - 1);
            answer++;
        }
        
        return answer;
    }
}