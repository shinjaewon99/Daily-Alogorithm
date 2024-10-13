import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        Queue<Integer> store = new LinkedList<>();

        for(int i = 1; i <= number; i++){
            store.add(i);
        }

        while(store.size() > 1){
            store.poll();
            store.add(store.poll());
        }

        System.out.println(store.poll());
    }
}
