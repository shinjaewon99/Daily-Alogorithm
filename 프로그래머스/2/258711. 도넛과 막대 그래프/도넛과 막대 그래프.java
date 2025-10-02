import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(int[][] edges) {
        int[] answer = new int[4];
        Map<Integer, Integer> in = new HashMap<>();
        Map<Integer, Integer> out = new HashMap<>();
        
        // 간선을 저장
        // ex [4,3] 이면 4에서 나가고 3으로 들어감
        for(int[] edge : edges){
            in.put(edge[1], in.getOrDefault(edge[1], 0) + 1);
            out.put(edge[0], out.getOrDefault(edge[0], 0) + 1);
        }
        
        for(int index : out.keySet()){
            if(out.get(index) > 1){
                // in 간선이 없으면 생성한 정점
                if(!in.containsKey(index)){
                    answer[0] = index;
                }else{
                    // 8자 모양 간선
                    answer[3] += 1;
                }
            }
        }
        
        // in간선은 있는데 out 간선이 없는경우 막대
        for(int index : in.keySet()){
            if(!out.containsKey(index)){
                answer[2] += 1;
            }
        }
        
        int totalGraphs = out.get(answer[0]);
        answer[1] = totalGraphs - (answer[2] + answer[3]);
        
        return answer;
    }
}