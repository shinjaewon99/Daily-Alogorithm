import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> store = new HashSet<>();
        
        int loop = in.nextInt();
        in.nextLine();  // 버퍼 비우기
        
        int result = 0;
        
        for(int i = 0; i < loop; i++){
            String word = in.nextLine();
            
            // "ENTER" 가 입력될경우, 새로운 사람이 입장
            if(word.equals("ENTER")){
                store.clear();
            }else{
                if(store.contains(word)) continue;
                store.add(word);
                result++;
            }
        }
        
        System.out.println(result);
    }
}
