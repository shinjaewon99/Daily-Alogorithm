import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        Set<String> store = new HashSet<>();

        for(int i = 0; i < word.length(); i++){
            for(int j = i + 1; j <= word.length(); j++){
                store.add(word.substring(i, j));
            }
        }

        System.out.println(store.size());
    }
}