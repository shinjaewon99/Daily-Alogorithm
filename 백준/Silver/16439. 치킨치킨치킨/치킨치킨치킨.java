import java.util.*;

class Main {
    private static int n; // 고리 회원의 수
    private static int m; // 치킨 종류의 수
    private static int[][] graph; 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        graph = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < m; j++){
                graph[i][j] = in.nextInt();
            }
        }

        System.out.println(findMax());
    }

    private static int findMax(){
        int max = 0;

        for(int i = 0; i < m; i++){
            for(int j = i + 1; j < m; j++){
                for(int k = j + 1; k < m; k++){
                    // 각 회원별 만족도 최대값
                    int conditionMax = 0;

                    for(int p = 0; p < n; p++){
                        conditionMax += Math.max(graph[p][i], 
                                                  Math.max(graph[p][j], graph[p][k]));
                    }
                    max = Math.max(max, conditionMax);
                }
            }
        }

        return max;
    }
}