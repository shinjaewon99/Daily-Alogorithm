import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] store = new int[n + 1];
        for(int i = 1; i <= n; i++){
            // 누적합 구하기
            store[i] = store[i - 1] + in.nextInt();
        }
        
        int[] result = new int[m];

        for(int i = 0; i < m; i++){
            int x = in.nextInt();
            int y = in.nextInt();

            result[i] = store[y] - store[x - 1];
        }

        for(int answer : result){
            System.out.println(answer);
        }
    }
}