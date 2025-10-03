class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder build = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        
        int start = 0;
        int length = t * m;
        
        for(int i = 0; i < length; i++){
            String word = Integer.toString(start, n).toUpperCase();
            build.append(word);
            start++;
        }
        
        for(int i = p - 1; i < length; i += m){
            char ch = build.charAt(i);
            answer.append(String.valueOf(ch));
        }

        return answer.toString();
    }
}