import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        Set<Integer> store = new HashSet<>();

        for(int i = 0; i < number; i++){
            store.add(in.nextInt());
        }

        int m = in.nextInt();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < m; i++){
            int compare = in.nextInt();

            if(store.contains(compare)){
                result.append(1).append(" ");
            }else{
                result.append(0).append(" ");
            }
        }

        System.out.println(result.toString());
    }
}
