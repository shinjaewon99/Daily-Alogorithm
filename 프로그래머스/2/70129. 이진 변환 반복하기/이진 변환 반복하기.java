class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int zeroCnt = 0;
        int result = 0;
        
        // 이진 결과가 1일때 까지 반복
        while(!(s.equals("1"))) {
            
            int countOne = 0;
            
            for(int i = 0; i < s.length(); i++){
                char word = s.charAt(i);
                
                if(word == '1'){
                    countOne++;
                }else{
                    zeroCnt++;
                }
            }
            
            // 2진으로 변환
            s = Integer.toBinaryString(countOne);
            
            result++;
            
        }
        
        answer[0] = result;
        answer[1] = zeroCnt;
        
        return answer;
    }
}