import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] method1 = {1,2,3,4,5};
        int[] method2 = {2,1,2,3,2,4,2,5};
        int[] method3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] count = new int[3];
        
        // 찍는 방식과 답을 비교
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == method1[i % 5]){
                count[0]++;
            }
            if(answers[i] == method2[i % 8]){
                count[1]++;
            }
            if(answers[i] == method3[i % 10]){
                count[2]++;
            }
        }

        // 최대로 맞춘 문제 갯수를 구한다 
        int maxCount = Math.max(count[0],Math.max(count[1], count[2]));
        
        List<Integer> store = new ArrayList<>();
        
        if(maxCount == count[0]){
            store.add(1);
        }
        if(maxCount == count[1]){
            store.add(2);
        }
        if(maxCount == count[2]){
            store.add(3);
        }
        
        
        
        return store.stream().mapToInt(i -> i).toArray();
    }
}