import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        
        String[] answer = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            answer[i] = String.valueOf(numbers[i]);
        }
        
        
        
        // 1. 재정의 하여 문자열 정렬
        // 예제 2번을 예로 들면 ("3" + "30").compareTo("30" + "3")은 "3" + "30"이 더 크므로 양수 리턴 즉 [3, 30]으로 정렬된다.
        Arrays.sort(answer, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        
        // 2. 0으로 이루어진 배열일 경우
        if(answer[0].equals("0")){
            return "0";
        }
        
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < answer.length; i++){
            output.append(answer[i]);
        }
        
        return output.toString();
    }
}