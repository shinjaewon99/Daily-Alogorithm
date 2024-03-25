import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] work = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++){
            work[i] = (100 - progresses[i]) / speeds[i]; // 걸리는 시간 
            if((100 - progresses[i]) % speeds[i] != 0){
                // speeds에 비해 남아있는 % 가 있을경우 하루를 더 계산한다.
                work[i] += 1; 
            }
        }
        // 7 7 9
        List<Integer> list = new ArrayList<>();
        int count = 1;
        int compare = work[0];
        for(int i = 1; i < progresses.length; i++){

            // 앞의 기능이 끝나기 전까지는 다음 기능을 완료할수없다.
            if(compare >= work[i]){
                count++;
            }else{
                list.add(count);
                count = 1; // 초기화 
                compare = work[i];
            }
        }
        list.add(count);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
