import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> termStore = new HashMap<>();
        
        
        String[] todayPart = today.split("\\.");
        int todayYear = Integer.parseInt(todayPart[0]);
        int todayMonth = Integer.parseInt(todayPart[1]);
        int todayDay = Integer.parseInt(todayPart[2]);
        
        // 수집 일자 파싱
        for(String word : terms){
            String[] term = word.split(" ");
            termStore.put(term[0], Integer.parseInt(term[1]));
        }
        
        for(int i = 0; i < privacies.length; i++){
            String[] privaciesPart = privacies[i].split(" ");
            String[] datePart = privaciesPart[0].split("\\.");
            
            int year = Integer.parseInt(datePart[0]);
            int month = Integer.parseInt(datePart[1]);
            int day = Integer.parseInt(datePart[2]);
            
            int termValue = termStore.get(privaciesPart[1]);
            
            month += termValue;
            
            // if 대신 while인 이유는, 유효기간이 1 이상 100이하 인 조건
            while(month > 12){
                month -= 12;
                year++;
            }
            
            // 1. 수집 년도가 오늘 날짜보다 작은경우 파기
            // 2. 수집 년도가 같은경우 수집 월이 오늘 월보다 작은경우 파기
            // 3. 수집 년도와 수집 월이 같은경우, 수집 일이 오늘 일보다 작거나 같은경우 파기
            if (year < todayYear || 
                (year == todayYear && month < todayMonth) || 
                (year == todayYear && month == todayMonth && day <= todayDay)) {
                result.add(i + 1); 
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
        
    }
}