import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        Queue<Integer> store = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            store.add(i);
        }

        StringBuilder result = new StringBuilder();

        result.append("<");
        
        while(store.size() > 1){
            // 원을 이루고 있음
            for(int i = 0; i < k - 1; i++){
                store.add(store.poll());
            }
            result.append(store.poll()).append(", ");
        }

        result.append(store.poll());
        result.append(">");
        System.out.println(result.toString());
    }
}