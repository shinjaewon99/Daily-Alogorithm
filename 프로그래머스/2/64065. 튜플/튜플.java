import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<Integer> solution(String s) {
        int[] answer = new int[10];
        Map<Integer, Integer> store = new HashMap<>();
       
        
        s = s.replaceAll("[{{}}]", "");
        
        //  집합에서 많이 나온 원소순으로 내림 차순 해야된다.
        for(String word : s.split(",")){
            int keyNumber = Integer.parseInt(word);
            store.put(keyNumber, store.getOrDefault(keyNumber, 0) + 1);
        }
        
        List<Integer> compare = new ArrayList<>(store.keySet());
        
        // List의 key값을 기준으로 Map 객체의 value를 비교 한다.
        compare.sort((a1, a2) -> store.get(a2).compareTo(store.get(a1)));
        
        return compare;
    }
}