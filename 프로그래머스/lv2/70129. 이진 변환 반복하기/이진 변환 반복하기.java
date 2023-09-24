class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int loop = 0;
        int zeroCount = 0;
    
        // 1. 문자열 s가 "1"이 될때까지 루프
        while(!s.equals("1")){
            // 2. 0이 제거된후 길이 변수
            int oneCount = 0;
            for(int i = 0; i < s.length(); i++){
                char num = s.charAt(i);
                
                if(num == '1'){
                    oneCount++;
                }
                if(num == '0'){
                    zeroCount++;
                }
            }
            // 3. 이진 변환 결과를 문자열 s의 재할당
            s = Integer.toBinaryString(oneCount);
            loop++;
        }
        
        answer[0] = loop;
        answer[1] = zeroCount;
        
        return answer;
    }
}