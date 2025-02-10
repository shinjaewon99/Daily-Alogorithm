import java.util.*;

class Main {
    private static char[][] graph;
    private static int n;
    private static int m;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        m = in.nextInt();
        in.nextLine();
        graph = new char[n][m];
        
        for(int i = 0; i < n; i++){
            graph[i] = in.nextLine().toCharArray();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                
                // .가 아닐경우 데칼코마니 구현
                if(graph[i][j] != '.'){
                    graph[i][m - j - 1] = graph[i][j];
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(new String(graph[i]));
        }
    }
}