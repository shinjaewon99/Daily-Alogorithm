import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, List<String>> reportStore = new HashMap<>();
        Map<String, Integer> reportCnt = new HashMap<>();
        int[] answer = new int[id_list.length];
        
        // 초기화
        for(String id : id_list){
            reportStore.put(id, new ArrayList<>());
            reportCnt.put(id, 0);
        }
        
        for(int i = 0; i < report.length; i++){
            String[] targets = report[i].split(" ");
            String key = "";
            String value = "";
            for(int j = 0; j < targets.length; j++){
                key = targets[0];
                value = targets[1];
                
            }
            
            if(!reportStore.get(key).contains(value)){
                reportCnt.put(value, reportCnt.getOrDefault(value, 0) + 1);
                reportStore.get(key).add(value);
            }
        }
        
        List<String> banUsers = new ArrayList<>();
        
        for(String name : reportCnt.keySet()){
            if(reportCnt.get(name) >= k){
                banUsers.add(name);
            }
        }
        
        // 정지된 ID와 유저가 신고했던 ID와 비교
        for(int i = 0; i < id_list.length; i++){
            String user = id_list[i];
            
            for(String compare : reportStore.get(user)){
                
                if(banUsers.contains(compare)){
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}