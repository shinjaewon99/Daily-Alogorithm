import java.util.*;
import java.util.regex.*;

class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int index = 0;
        int answer = 0;
        
        // 점수|보너스|옵션 추출
        Pattern regex = Pattern.compile("(\\d{1,2})([SDT])([*#]?)");
        Matcher temp = regex.matcher(dartResult);

        while (temp.find()) {
            int num = Integer.parseInt(temp.group(1));
            String bonus = temp.group(2);
            String type = temp.group(3);
            
            // 보너스 처리
            switch (bonus) {
                case "S": num = (int) Math.pow(num, 1); break;
                case "D": num = (int) Math.pow(num, 2); break;
                case "T": num = (int) Math.pow(num, 3); break;
            }
            
            if(type.equals("*")){
                num *= 2;
                
                // 효과 중첩
                if(index > 0) {
                    score[index - 1] *= 2;
                }
            }else if(type.equals("#")){
                num *= -1;
            }
            score[index++] = num;
        }
        
        answer = score[0] + score[1] + score[2];
        return answer;
    }
}