import java.util.Arrays;

class Solution {
    public int solution(int[][] routes) {
        // 차량 경로의 마지막 값을 기준으로 정렬
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        
        int answer = 0;
        int min = Integer.MIN_VALUE;
        
        for(int[] route : routes){
            
            if(min < route[0]){
                answer++;
                min = route[1]; // 현재 카메라의 위치를 갱신
            }
        }
        
        return answer;
    }
}