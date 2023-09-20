class Solution {
    public String solution(String X, String Y) {
        int xLength = X.length();
        int yLength = Y.length();
        
        StringBuilder answer = new StringBuilder();
        
        
        // 1. 0 ~ 9 까지 저장할 배열 크기
        int[] xNumbers = new int[10];
        int[] yNumbers = new int[10];
        
        // 2. 숫자 갯수에 따른 배열 증가
        for(String num : X.split("")){
            xNumbers[Integer.parseInt(num)]++;
        }
        
        for(String num : Y.split("")){
            yNumbers[Integer.parseInt(num)]++;
        }
        
        // 3. 9 ~ 0 까지 탐색
        for(int i = 9; i >= 0; i--){
            // 4. 짝꿍 숫자가 없을때 까지 저장
            while(xNumbers[i] > 0 && yNumbers[i] > 0){
                answer.append(i);
                
                xNumbers[i]--;
                yNumbers[i]--;
            }
        }
        
        // 5. 조건에 맞게 return
        
        if("".equals(answer.toString())) return "-1";
        
        // 6. 숫자 짝꿍의 0은 최대가 0 이다.
        if("0".equals(answer.substring(0,1))) return "0";
        
        return answer.toString();
    }
}