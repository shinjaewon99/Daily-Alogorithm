import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        PriorityQueue<Integer> store = new PriorityQueue<>();
       

        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                int num = in.nextInt();
                store.add(num);
                // 힙 크기보다 크면 가장 작은 값 제거
                if(store.size() > number){
                    store.poll();
                }
            }
        }

        System.out.println(store.peek());
    }
}