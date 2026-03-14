import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] store = new int[n + 1];
        
        for(int q = 0; q < m; q++) {
            int i = in.nextInt(); // i번 바구니부터
            int j = in.nextInt(); // j번 바구니까지
            int k = in.nextInt(); // k번 공을 넣는다


            // 덮어쓰기
            for(int z = i; z <= j; z++){
                store[z] = k;
            }
        }

        for(int x = 1; x <= n; x++){
            System.out.print(store[x] + " ");
        }

    }
}