import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> store = new HashMap<>();
        for(int i = 0; i < n; i++){
            String word = in.nextLine();
            store.put(word, store.getOrDefault(word, 0) + 1);
        }

        for(int i = 0; i < n - 1; i++){
            String word = in.nextLine();
            store.put(word, store.getOrDefault(word, 0) - 1);
        }

        for (Map.Entry<String, Integer> entry : store.entrySet()) {
            if (entry.getValue() > 0) { // 값이 1인 사람이 완주하지 못한 사람
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}