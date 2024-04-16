import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
   
    
        String[] answer = Arrays
            .stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);
        
        // 1. 입력값이 6, 10, 2 일때 "610"이 "106" 보다 크므로 정렬 
        Arrays.sort(answer, (o1, o2) -> (o2 + o1)
                    .compareTo(o1 + o2));
        
        // 2. 0번인덱스가 0인 경우는 0으로 이루어진 배열 뿐이다.
        if(answer[0].equals("0")){
            return "0";
        }
        
        StringBuilder result = new StringBuilder();
        
        for(String num : answer){
            result.append(num);
        }
        
        return result.toString();
    }
}