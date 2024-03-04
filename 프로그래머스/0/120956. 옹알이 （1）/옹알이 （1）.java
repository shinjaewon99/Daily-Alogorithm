class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < words.length; j++){
                // 1. babbling 배열에 발음 할 수 있는 것이 있으면 replace
                babbling[i] = babbling[i].replace(words[j], " ");
            }
            // 2. 공백제거
            babbling[i] = babbling[i].replaceAll(" ", "");
        }
        
        for(int i = 0; i < babbling.length; i++){
            if(babbling[i].equals("")) answer++;
        }
        
      
        
        return answer;
    }
}