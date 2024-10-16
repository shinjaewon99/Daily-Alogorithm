import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        Set<Integer> store1 = new HashSet<>();
        Set<Integer> store2 = new HashSet<>();

        for(int i = 0; i < a; i++){
            store1.add(in.nextInt());
        }

        for(int i = 0; i < b; i++){
            store2.add(in.nextInt());
        }

        Set<Integer> tempA = new HashSet<>(store1);
        tempA.removeAll(store2);

        Set<Integer> tempB = new HashSet<>(store2);
        tempB.removeAll(store1);

        System.out.println(tempA.size() + tempB.size());
    }
}