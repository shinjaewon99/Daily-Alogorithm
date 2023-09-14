class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        // 1. day 배열에 요일의 이름 저장
        String[] day = new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
 
        // 2. date 배열에 월별 날짜 수 저장 (윤년)
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDate = 0;
        
        // 3. 총 일수 계산하기
        for(int i = 0; i < a - 1; i++){
            totalDate += date[i]; 
        }
        
        totalDate += b - 1;
        
        // 4. day 배열에 저장된 요일 인덱스 계산
        answer = day[totalDate % 7];
        
        return answer;
    }
}