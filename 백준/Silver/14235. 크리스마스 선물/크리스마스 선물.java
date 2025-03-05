import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 거점지를 방문한 횟수

        // 최대 힙으로 저장
        PriorityQueue<Integer> store = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < n; i++){
            int gift = in.nextInt();

            // 아이를 만남
            if(gift == 0){
                if(store.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(store.poll());
                }
            }else{
                for(int j = 0 ; j < gift; j++){
                    store.add(in.nextInt());
                }
            }
        }
    }
}
