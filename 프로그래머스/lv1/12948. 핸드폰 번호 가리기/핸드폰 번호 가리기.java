class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for(int i = 0; i < phone_number.length(); i++){
            // 1. 뒷자리 4자리만 정상 phone_number 할당
            if(i >= phone_number.length() - 4){
                answer += phone_number.charAt(i);
            }else{
                answer += "*";
            }
        }
      
        
        return answer;
    }
}