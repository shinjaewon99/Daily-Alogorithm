import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        Map<String, Integer> store = new HashMap<>();

        for(int i = 0; i < n; i++){
            int length = in.nextInt();
            in.nextLine();
            String[] words = in.nextLine().split(" ");

            for(String word : words){
                store.put(word, store.getOrDefault(word, 0) + 1);
            }
        }

        int count = 0;
        for (int value : store.values()) {
            if (value >= m) {
                count++;
            }
        }

        System.out.println(count);
    }
}