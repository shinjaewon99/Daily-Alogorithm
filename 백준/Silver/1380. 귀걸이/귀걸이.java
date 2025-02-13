import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int seqNumber = 1;

        while(true){
            
            int n = in.nextInt(); // 여학생의 수
            if(n == 0) break;
            in.nextLine();

            Map<Integer, String> store = new HashMap<>();
            Map<Integer, Integer> cntStore = new HashMap<>();

            for(int i = 1; i <= n; i++){
                String name = in.nextLine();
                store.put(i, name);
                cntStore.put(i, 0);
            }

            for(int i = 0; i < 2 * n - 1; i++){
                int index = in.nextInt();
                String ab = in.next();

                cntStore.put(index, cntStore.get(index) + 1); // 등장 횟수 증가
            }

            for (Map.Entry<Integer, Integer> entry : cntStore.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println(seqNumber + " " + store.get(entry.getKey()));
                    break;
                }
            }
            
            seqNumber++;
        }
    }
}
