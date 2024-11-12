import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        long result = 0;

        List<Integer> store = new ArrayList<>();
        
        for(int i = 0; i < t; i++){
            store.add(in.nextInt());
        }
        Collections.sort(store, Collections.reverseOrder());

        for(int i = 0; i < t; i++){
             // 팁 계산
            int calcu = store.get(i) - i;

            if(calcu > 0){
                result += calcu;
            }
        }

        System.out.println(result);
    }
}