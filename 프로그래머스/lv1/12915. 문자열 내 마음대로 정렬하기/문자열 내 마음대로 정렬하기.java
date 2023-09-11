import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
      int length = strings.length;
        String[] answer = new String[length];
        List<String> list = new ArrayList<>();

        // 1. n 인덱스가 같을경우 다른 문자가 사전순으로 먼저 출력되야 함으로 오름차순 정렬
        Arrays.sort(strings);

        // 2. list객체에 문자배열 strings을 담는다.
        for(int i = 0; i < length; i++){
            list.add(strings[i]);
        }

        // 3. 문자배열 strings의 n번째 인덱스를 담는다.
        for(int i = 0; i < length; i++){
            answer[i] = strings[i].substring(n, n + 1);
        }

        // 4. 인덱스의 문자 오름차순 정렬
        Arrays.sort(answer);

        // 5. list 객체의 문자와 answer 배열의 문자 탐색
        for(int i = 0; i < length; i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(j).substring(n, n + 1).equals(answer[i])){
                    answer[i] = list.get(j);

                    // 6. 객체를 비워줘야된다.
                    list.remove(j);
                    break;
                }
            }
        }
        
        return answer;
    }
}