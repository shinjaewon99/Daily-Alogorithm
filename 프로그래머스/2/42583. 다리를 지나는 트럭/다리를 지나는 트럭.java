import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> store = new LinkedList<>();
        
        int sum = 0;
        // 1. 트럭이 다리에 올라갈때 시간++
        for(int truck : truck_weights){
            while(true){
                if(store.isEmpty()){
                    store.add(truck);
                    sum += truck;                    
                    answer++;
                    break;
                }
                // 2. 다리의 길이가 현재 다리위에 있는 트럭의 갯수와 똑같을 경우
                else if (store.size() == bridge_length){
                    sum -= store.poll();
                }else{
                    // 3. 트럭의 무게를 비교하여 다리에 올릴지 판단
                    if(sum + truck <= weight){
                        store.add(truck);
                        sum += truck;
                        answer++;
                        break;
                    }
                    // 4. 다음 트럭이 올 수 있게, 다리의 길이를 맞추기 위해 0을 삽입
                    else{
                        store.add(0);
                        answer++;
                    }
                }
            }
        }
        // 5. 다리위에 올라가져 있는 트럭이 다리의 길이만큼 건너는 시간을 계산
        return answer + bridge_length;
    }
}