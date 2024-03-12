class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        // 1. 중복 되지 않는 문자열
        String[] compare = {"aya", "ye", "woo", "ma"};
        
        // 2. 중복 된 문자열
        String[] duplicate = {"ayaaya", "yeye", "woowoo", "mama"};
        
        // 3. 중복 문자열 찾기
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < compare.length; j++){
                babbling[i] = babbling[i].replace(duplicate[j], "1");
            }
        }
        
        // 4. 발음 할 수 있는 문자열 찾기
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < compare.length; j++){
                babbling[i] = babbling[i].replace(compare[j], " ");
            }
            
            babbling[i] = babbling[i].replace(" ", "");
        }
        
        // 5. 발음 할 수 있는 문자열 계산
        for(int i = 0; i < babbling.length; i++){
            if(babbling[i].equals("")) answer++;
        }
        
        return answer;
    }
}