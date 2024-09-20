import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] store1 = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                store1[i][j] = in.nextInt();
            }
        }

        // 변수 m과 동일 함
        int m2 = in.nextInt();
        int p = in.nextInt();

        int[][] store2 = new int[m][p];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < p; j++){
                store2[i][j] = in.nextInt();
            }
        }

        // 결과를 담을 배열
        int[][] result = new int[n][p];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < p; j++){
                for(int k = 0; k < m; k++){
                    result[i][j] += store1[i][k] * store2[k][j];
                    
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < p; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
       
    }
}
