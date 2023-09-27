import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int index = 0;
        Arrays.sort(people);
        
        // 1. 오름차순 정렬된 people 배열을 역순으로 index 변수 까지 탐색 
        // (중복된 계산을 막기위해)
        for(int i = people.length - 1; i >= index; i--){
            if(people[i] + people[index] <= limit){
                answer++;
                index++;
            }
            // 2. 혼자 보트를 타야되는 경우
            else{
                answer++;
            }
        }
        return answer;
    }
}