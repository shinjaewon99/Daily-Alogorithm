import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 쇠막대 갯수
        PriorityQueue <Integer> store = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            store.add(in.nextInt());
        }

        long result = 0;
        
        while(store.size() > 1){
            int x = store.poll(); // 첫번째로 작은수
            int y = store.poll(); // 그 다음으로 작은수
            result += x * y;
            store.add(x + y);
        }

        System.out.println(result);
    }
}
