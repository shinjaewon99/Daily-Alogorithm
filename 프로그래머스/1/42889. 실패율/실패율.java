import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        int[] store = new int[N + 2];
        int length = stages.length;
        
        for(int stage : stages){
            store[stage]++;
        }
        
        List<double[]> fail = new ArrayList<>();
        for(int i = 1; i <= N; i++){
            if(length == 0){
                fail.add(new double[]{i, 0});
            }else{
                double result = (double) store[i] / length;
                fail.add(new double[]{i, result});
                length -= store[i];
            }
        }
        
        // 실패율 내림차순 정렬, 같으면 스테이지 번호 오름차순
        fail.sort((a,b) -> {
            if(a[1] == b[1]){
                return Double.compare(a[0], b[0]);
            }else{
                return Double.compare(b[1], a[1]);
            }
        });
        
        
        for (int i = 0; i < N; i++) {
            answer[i] = (int) fail.get(i)[0];
        }
        
        return answer;
    }
}