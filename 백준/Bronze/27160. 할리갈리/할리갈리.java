import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 카드 갯수
        in.nextLine();
        Map<String, Integer> store = new HashMap<>();
        
        for(int i = 0; i < t; i++){
            String word = in.next(); // 과일 종류
            int count = in.nextInt(); // 개수

            store.put(word, store.getOrDefault(word, 0) + count);
        }

        boolean flag = false;
        for(int value : store.values()){

            if(value == 5){
                flag = true;
                break;
            }
        }
        System.out.println(flag ? "YES" : "NO");
    }
}