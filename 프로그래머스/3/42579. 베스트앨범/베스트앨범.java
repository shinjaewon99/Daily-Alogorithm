import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String,Integer> store = new HashMap<>(); // 장르별 재생 횟수
        Map<String, Map<Integer, Integer>> indexStore = new HashMap<>(); // 장르별 고유번호 재생 횟수
        List<Integer> answer = new ArrayList<>();
        
        
        for(int i = 0; i < genres.length; i++){
            // 1. 장르별로 고유번호별 재생 횟수 저장
            if(store.containsKey(genres[i])){
                indexStore.get(genres[i]).put(i, plays[i]);
            }else{
                Map<Integer, Integer> indexCount = new HashMap<>();   
                indexCount.put(i, plays[i]);
                indexStore.put(genres[i], indexCount);
            }
            // 2. 장르별 재생 횟수 저장
            store.put(genres[i], store.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        // 3. 장르의 입력 순서를 정해줘야 함 (총 재생 횟수 내림차순 )
        List<String> keySetStore = new ArrayList<>(store.keySet());
        Collections.sort(keySetStore, (o1, o2) -> store.get(o2) - store.get(o1));
        
        // 4. 장르별 고유번호의 재생횟수를 내림 차순으로 구하기
        for(String music : keySetStore){
            // key : pop 일때 {"1":600,"4":2500} 와 같이 Map 객체에 저장된다.
            Map<Integer, Integer> indexCount = indexStore.get(music);
            
            // 5. 고유 번호만 List에 저장
            List<Integer> genresKeySet = new ArrayList(indexCount.keySet());
            
            // 6. 고유 번호별 재생횟수를 내림 차순으로 정렬
            Collections.sort(genresKeySet, (o1, o2) -> indexCount.get(o2) - indexCount.get(o1));
            
            answer.add(genresKeySet.get(0));
            
            if(genresKeySet.size() > 1){
                answer.add(genresKeySet.get(1));
            }
        }
        
        return answer.stream().mapToInt(c -> c).toArray();
    }
}