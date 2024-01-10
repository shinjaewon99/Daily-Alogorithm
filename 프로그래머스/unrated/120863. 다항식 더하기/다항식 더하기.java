class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String [] words = polynomial.split(" +");
        
        int total1 = 0; // x항 총합
        int total2 = 0; // 상수항 총합
        
        // 3x, 7, x
        
        // 1. 입력값에 대한 x항과 상수항 계산
        for(String word : words){
            if(word.equals("x")){
                total1 += 1;
            }else if(word.contains("x")){
                total1 += Integer.parseInt(word.substring(0, word.length() - 1));
            }else if(!word.equals("+")){
                total2 += Integer.parseInt(word);
            }
        }
        
        // 2. x항만 값이 존재할 경우
        if(total1 != 0 && total2 == 0){
            if(total1 == 1){
                answer = "x";
            }else{
                answer = total1 + "x";
            }
        }
        
        // 3. 상수항만 값이 존재할 경우
        if(total1 == 0 && total2 != 0){
            answer = String.valueOf(total2);
        }
              
        // 4. x항과 상수항 둘다 값이 존재할 경우
        if(total1 != 0 && total2 != 0){
            if(total1 == 1){
                answer = "x" + " + " + total2;
            }else{
                answer = total1 + "x" + " + " + total2;
            }
        }
        
        return answer;
    }
}