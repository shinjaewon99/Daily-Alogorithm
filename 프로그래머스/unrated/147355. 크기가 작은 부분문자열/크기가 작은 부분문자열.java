class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        // 1. 문자열 t의 길이만큼 탐색합니다.
        for(int i = 0; i < t.length(); i++){
            // 2. 자를려고 하는 인덱스의 범위가 남아있는 문자열보다 작거나 같아야 합니다.
            if(i <= t.length() - p.length()){
            Long compare = Long.parseLong(t.substring(i, i + p.length()));
            Long pNumber = Long.parseLong(p);
                // 3. 입력된 p의 문자가 비교할 compare 변수보다 크거나 같은경우 카운트 해줍니다.
                if(compare <= pNumber){
                    answer++;
                }
            }
        }
        return answer;
    }
}