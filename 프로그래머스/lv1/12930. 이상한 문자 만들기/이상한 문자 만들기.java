class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        // 1. 문자열을 분할합니다.
        String[] sSplit = s.split("");
        
        int index = 0;
        // 2. 분할된 각 단어에 대해 처리합니다.
        for (int i = 0; i < sSplit.length; i++) {
            String temp = sSplit[i];
            // 3. 공백일경우 index 변수 초기화
            if(temp.equals(" ")){
                index = 0;
            }else if(index % 2 == 0){
                temp = temp.toUpperCase();
                index++;
            }else{
                temp = temp.toLowerCase();
                index++;
            }
            answer.append(temp);
            
        }
        return answer.toString();
    }
}
