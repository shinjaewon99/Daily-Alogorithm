import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int[] store = new int[101];
        
        // 각 트럭의 출발시간 도착시간 저장
        for(int i = 0; i < 3; i++){
            int start = in.nextInt();
            int end = in.nextInt();

            for(int t = start; t < end; t++){
                store[t]++;
            }
        }

        int total = 0;
        for (int i = 1; i <= 100; i++) {
            if (store[i] == 1) {
                total += a;
            } else if (store[i] == 2) {
                total += b * 2;
            } else if (store[i] == 3) {
                total += c * 3;
            }
        }

        System.out.println(total);
        
    }
}