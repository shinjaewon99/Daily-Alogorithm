import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] words = in.nextLine().split(" ");
        List<Integer> store = new ArrayList<>();

        for(String word : words){
            store.add(Integer.valueOf(word));
        }

        Collections.sort(store);

        System.out.println(store.get(1));
    }
}