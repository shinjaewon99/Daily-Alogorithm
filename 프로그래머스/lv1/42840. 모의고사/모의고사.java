import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        
        // 1. 수포자의 찍는 번호 배열 저장
        int[] supo1 = new int[]{1,2,3,4,5};
        int[] supo2 = new int[]{2,1,2,3,2,4,2,5};
        int[] supo3 = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        int supo1Result = 0;
        int supo2Result = 0;
        int supo3Result = 0;
        
        // 2. 수포자들의 맞힌 문제 갯수 탐색
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == supo1[i % supo1.length]){
                supo1Result++;
            }
            if(answers[i] == supo2[i % supo2.length]){
                supo2Result++;
            }
            if(answers[i] == supo3[i % supo3.length]){
                supo3Result++;
            }
        }
        
        // 3. 최대 점수 변수 저장
        int maxScore = Math.max(supo1Result, Math.max(supo2Result, supo3Result));
        
        List<Integer> list = new ArrayList<>();
        
        // 4. 수포자들의 맞힌 갯수와 최대 점수와 비교
        if(maxScore == supo1Result){
            list.add(1);
        }
        
        if(maxScore == supo2Result){
            list.add(2);
        }
        
        if(maxScore == supo3Result){
            list.add(3);
        }
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}