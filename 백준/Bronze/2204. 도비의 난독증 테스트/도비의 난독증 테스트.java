import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            int length = in.nextInt();
            in.nextLine(); // 개행문자 제거
            
            if(length == 0) break;

            List<String> store = new ArrayList<>();
            for(int i = 0; i < length; i++){
                String word = in.nextLine();
                
                store.add(word);
            }

            // 대소문자 구분없이 정렬
            Collections.sort(store, (o1,o2) -> o1.toLowerCase().compareTo(o2.toLowerCase()));

            System.out.println(store.get(0));

        }
        
    }
}
