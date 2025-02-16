import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 토핑의 갯수
        in.nextLine();
        int cnt = 0;
        Set<String> store = new HashSet<>();

        for(int i = 0; i < n; i++){
            String word = in.next();
            if(word.endsWith("Cheese")){
                store.add(word);
            }
        }

        if(store.size() >= 4){
            System.out.println("yummy");
        }else{
            System.out.println("sad");
        }
    }
}
