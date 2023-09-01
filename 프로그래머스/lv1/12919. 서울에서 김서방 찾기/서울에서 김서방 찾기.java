class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        // 1. seoul 배열에서 "Kim" 문자열 찾기
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        
        return answer;
    }
}