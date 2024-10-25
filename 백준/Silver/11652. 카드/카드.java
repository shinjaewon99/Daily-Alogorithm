import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int count = 0;
        long minValue = Long.MAX_VALUE;
        Map<Long, Integer> store = new HashMap<>();

        for(int i = 0; i < n; i++){
            long num = in.nextLong();
            store.put(num, store.getOrDefault(num, 0) + 1);

            if(store.get(num) > count){
                count = store.get(num); // 갯수 max값 할당
                minValue = num;
            }else if(store.get(num) == count){
                minValue = Math.min(num, minValue);
            }
        }

        System.out.println(minValue);
        
    }
}