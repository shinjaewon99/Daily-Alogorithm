import java.util.*;

class Main {
    private static int n;
    private static int m;
    private static char[][] graph;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = (in.nextInt() * 5) + 1; // 세로의 길이
        m = (in.nextInt() * 5) + 1; // 가로의 길이
        in.nextLine();

        // 결과를 담을 배열
        int[] results = new int[5];

        graph = new char[n][m];

        for(int i  = 0; i < n; i++){
            String word = in.next();

            for(int j = 0; j < m; j++){
                graph[i][j] = word.charAt(j);
            }
        }

        // 가로 탐색
        for(int i = 1; i < m; i += 5){
            int count = 0;

            // 세로 탐색
            for(int j = 1; j < n; j++){
                if(j % 5 == 0){
                    results[count]++;
                    count = 0; // 초기화
                }else{
                    if(graph[j][i] == '*'){
                        count++;
                    }
                }
            }
        }
        
        for(int i = 0; i < 5; i++){
            System.out.print(results[i] + " ");
        }
    }
}