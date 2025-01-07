import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        int length = players.length;
        int index = 0;
        Map<String, Integer> store = new HashMap<>();
        
        for(String player : players){
            store.put(player, index++);
        }
        
        for(String calling : callings){
            int getIndex = store.get(calling); // 호출된 선수의 현재 순위
            
            if(getIndex > 0){
                
                // 바로 앞선 선수 찾기
                String aheadPlayer = players[getIndex - 1];
                
                // 바로 앞선 선수와 교체
                players[getIndex] = aheadPlayer;
                players[getIndex - 1] = calling;
                
                // Map 객체 갱신
                store.put(calling, getIndex - 1);
                store.put(aheadPlayer, getIndex);
            }
        }
        
        return players;
    }
}