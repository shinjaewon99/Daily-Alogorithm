class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        for(int i = 0; i < A.length(); i++) {
            // A 와 B가 같을 경우
            if(A.equals(B)){
                return answer;
            }
            // 끝글자를 추출
            String subWord =  A.substring(A.length() - 1);
            
            // 추출한 끝글자를 더한다.
            A = subWord + A.substring(0, A.length() - 1);
            
            answer++;
        }
        return -1;
    }
}