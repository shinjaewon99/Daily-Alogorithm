import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        int fee0 = fees[0]; // 기본시간
        int fee1 = fees[1]; // 기본 요금
        int fee2 = fees[2]; // 단위 시간
        int fee3 = fees[3]; // 단위 요금
        
        Map<String, Integer> inOut = new HashMap<>();
        Map<String, Integer> totalPark = new HashMap<>(); 
        
        for(String record : records){
            String[] splitRecord = record.split(" ");
            
            String time = splitRecord[0];
            String carNum = splitRecord[1];
            String type = splitRecord[2];
            
            int min = convertMin(time);
            
            // 입출차 저장
            if(type.equals("IN")){
                inOut.put(carNum, min);
            }else{
                int n = inOut.remove(carNum);
                int diff = min - n;
                
                totalPark.put(carNum, totalPark.getOrDefault(carNum, 0) + diff);
            }
        }
        
        // 출차하지 않는차
        for(String key : inOut.keySet()){
            int maxDiff = 1439 - inOut.get(key);
            totalPark.put(key, totalPark.getOrDefault(key, 0) + maxDiff);
        }
        
        List<String> cars = new ArrayList<>(totalPark.keySet());
        Collections.sort(cars);
        
        int[] answer = new int[cars.size()];
        int idx = 0;
        for (String car : cars) {
            int time = totalPark.get(car);
            int fee = getResult(time, fee0, fee1, fee2, fee3);
            answer[idx++] = fee;
        }
 
        return answer;
    }
    
    private int convertMin(String time){
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }
    
    private int getResult(int num1, int num2, 
                          int num3, int num4, int num5){
        if (num1 <= num2) return num3; // 기본시간 보다 출차 시간이 작은경우 기본요금
        return num3 + (int) Math.ceil((double)(num1 - num2) / num4) * num5;
    }
}