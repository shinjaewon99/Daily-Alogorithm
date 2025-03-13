import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 슬라임 갯수
        PriorityQueue<Integer> store = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            store.add(in.nextInt());
        }

        int sum = 0;
        
        while(store.size() > 1){
            int x = store.poll();
            int y = store.poll();
            
            sum += x * y;
            store.add(x + y);
        }

        System.out.println(sum);
    }
}