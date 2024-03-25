import java.util.List;
import java.util.ArrayList;

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> store = new ArrayList<>();
		int[] work = new int[progresses.length];

		for (int i = 0; i < progresses.length; i++) {
			// 1. 속도와 비교하여 잔여 일 수 구하기
			work[i] = (100 - progresses[i]) / speeds[i];

			// 2. 작업 진도가 남은 경우 일 수를 늘려야 함
			if((100 - progresses[i]) % speeds[i] != 0){
				work[i] += 1;
			}
		}
        
        // 3. 저장된 work 배열 비교
        int count = 1;
        int compare = work[0];
        for(int i = 1; i < work.length; i++){
            if(compare >= work[i]){
                count++;
            }else{
                store.add(count);
                compare = work[i];
                count = 1;
            }
        }
        
        // 4. 마지막에 남아있는 배포 일
        store.add(count);
        
        int[] answer = new int[store.size()];
        
        for(int i = 0; i < store.size(); i++){
            answer[i] = store.get(i);
        }

		return answer;
	}
}