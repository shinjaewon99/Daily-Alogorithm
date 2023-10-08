import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] works = new int[progresses.length];
        
        // 1. 걸리는 시간을 works 배열에 저장
        for(int i = 0; i < progresses.length; i++){
            
            // 2. 100%을 기준으로 걸리는 시간을 계산한다.
            works[i] = (100 - progresses[i]) / speeds[i];
            
            // 3. 기능 30%의 속도 30을 기준으로는 2일이 아니라 3일이 걸린다. 남은 기능이 있을경우 속도와 상관없이 100%를 채워야한다.
            if((100 - progresses[i]) % speeds[i] != 0){
                works[i] += 1; 
            }
        }
    
        List<Integer> store = new ArrayList<>();
        int count = 1;
        
        // 4. 기준이 되는 변수
        int compare = works[0];
        
        for(int i = 1; i < works.length; i++){
            // 5. 앞에 있는 기능이 끝나야 다음 기능을 배포가능
            if(compare >= works[i]){
                count++;
            }else{
                store.add(count);
                count = 1; // 6. count 초기화
                compare = works[i];
            }
        }
        
        // 7. 남은 기능 저장
        store.add(count);
        
        int[] answer = new int[store.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = store.get(i);
        }
        

        return answer;
    }
}