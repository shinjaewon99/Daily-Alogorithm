import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 열
        int m = in.nextInt(); // 행

        int[][] store = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                store[i][j] = in.nextInt();
            }
        }

        int k = in.nextInt(); // 합을 구할 부분

        while(k --> 0){
            int i = in.nextInt();
            int j = in.nextInt(); 
            int x = in.nextInt();
            int y = in.nextInt();

            int result = 0;
            for(int q = i - 1; q < x; q++){
                for(int p = j - 1; p < y; p++){
                    result += store[q][p];
                }
            }

            System.out.println(result);
        }
        
       
    }
}
