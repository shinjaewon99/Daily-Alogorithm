import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Integer, Integer> store = new HashMap<>();
        
        // 1. {} 괄호를 replaceAll
        s = s.replaceAll("[{}]", "");
        
        for(String numbers : s.split(",")){
            int number = Integer.valueOf(numbers);
            store.put(number, store.getOrDefault(number, 0) + 1);
        }
        
        // 2. 키의 value값을 기준으로 키값을 오름차순 정렬
        List<Integer> result = new ArrayList<>(store.keySet());
        
        Collections.sort(result, new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2){
                return store.get(n2) - store.get(n1);
            }
        });
        
        // 3. 정렬된 값 배열에 담기
        int[] answer = new int[result.size()];
        
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}