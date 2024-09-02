import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Set<String> store = new HashSet<>();
        
        int loop = in.nextInt();
        in.nextLine(); // 버퍼 비우기
        
        // "ChongChong" 은 무조건 나오니 Set 객체에 저장
        store.add("ChongChong");
        
        for(int i = 0; i < loop; i++){
            String word1 = in.next();
            String word2 = in.next();
            
            // 춤추고 있는 사람을 만나면 다음 사람도 춤춘다.
            if(store.contains(word1) || store.contains(word2)) {
                store.add(word1);
                store.add(word2);
            }
        }
        System.out.println(store.size());
    }
}
