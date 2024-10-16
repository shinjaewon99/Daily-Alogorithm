import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Set<String> store = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();

        for(int i = 0; i < n; i++){
            String word = in.nextLine();
            store.add(word);
        }

        int result = 0;

        for(int i = 0; i < m; i++){
            String compare = in.nextLine();

            if(store.contains(compare)){
                result++;
            }
        }
        
        System.out.println(result);
    }
}