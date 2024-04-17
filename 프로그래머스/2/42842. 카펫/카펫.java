class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        // 1. 입력값이 brown : 10, yellow = 2 일 때
        // 나올수 있는 경우의 수 : (1, 12) (2, 6) (3, 4) (4, 3) (6, 2) (12, 1)
        // 가로세로 길이 조건 : (4, 3) (6, 2) (12, 1)
        // yellow가 중간에 있어야함 : (4, 3)만 가능
        for(int i = 3; i < total; i++){
            int num = total / i;
            
            if(num >= 3) {
                int garo = Math.max(num, i);
                int sero = Math.min(num, i);
                // 2. 중간에 위치하기 위해 
                // 가로의 맨위, 아래칸을 제거
                // 세로의 맨 왼쪽, 오른쪽을 제거
                int middle = (garo - 2) * (sero - 2);
                if(yellow == middle){
                    answer[0] = garo;
                    answer[1] = sero;
                }
            }
        }
        
        return answer;
    }
}