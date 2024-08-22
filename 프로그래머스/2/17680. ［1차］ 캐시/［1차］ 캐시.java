import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Set<String> cache = new HashSet<>();
        Queue<String> store = new LinkedList<>();
        
        if(cacheSize == 0){
            return cities.length * 5;
        }
        
        for(String city : cities){
            String lowerCity = city.toLowerCase();
            
            // cache에 존재하는 도시 일 경우
            if(cache.contains(lowerCity)){
                answer += 1;
                
                // 해당 도시를 최근의 도시로 갱신
                store.remove(lowerCity);
                store.add(lowerCity);
            }else{
                answer += 5;
                // cache에 담긴 도시들을 앞으로 밀면서 밀어내야한다.   
                if(cache.size() == cacheSize){
                    String removeCity = store.poll();
                    cache.remove(removeCity);
                }
                cache.add(lowerCity);
                store.add(lowerCity);
            }
        }
        
        
        return answer;
    }
}