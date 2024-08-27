import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        // 최소값을 담아준다.
        PriorityQueue<Integer> store1 = new PriorityQueue<>();
        
        // 최대값을 담아준다.
        PriorityQueue<Integer> store2 = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String word : operations){
            String[] parts = word.split(" ");
            
            // 구분자와 숫자를 꺼내온다.
            String compare = parts[0];
            int number = Integer.parseInt(parts[1]);
            
            if(compare.equals("I")){
                store1.add(number);
                store2.add(number);
            }
            else if(compare.equals("D")){
                // 큐에서 최댓값을 삭제
                if(number == 1){
                    if(!store1.isEmpty()){
                        int max = store2.poll();
                        store1.remove(max);
                    }
                }
                // 큐에서 최솟값을 삭제
                else if(number == -1){
                    
                    if(!store2.isEmpty()){
                        int min = store1.poll();
                        store2.remove(min);
                    }
                }
            }
        }
       
        if (store1.isEmpty() || store2.isEmpty()) {
            return new int[]{0, 0};
        } else {
            return new int[]{store2.peek(), store1.peek()};
        }
    }
}