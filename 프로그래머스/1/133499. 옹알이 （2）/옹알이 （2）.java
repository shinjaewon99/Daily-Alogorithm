class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int length = babbling.length;
        String[] speak = {"aya", "ye", "woo", "ma"};
        String[] duplicate = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(int i = 0; i < length; i++){
            for(int j = 0; j < speak.length; j++){
                babbling[i] = babbling[i].replace(duplicate[j], "1");
            }
        }
        
        for(int i = 0; i < length; i++){
            for(int j = 0; j < speak.length; j++){
                babbling[i] = babbling[i].replace(speak[j], " ");
            }
             babbling[i] = babbling[i].replace(" ", "");
        }
        
        for(String babb : babbling){
            if(babb.equals("")) answer++;
        }
        
        return answer;
    }
}