import java.util.*;

class Main {
    private static int n;
    private static int r;
    private static int c;
    private static char[][] graph;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        r = in.nextInt() - 1;
        c = in.nextInt() - 1;

        graph = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                // 홀수 짝수 패턴
                if((i + j) % 2 == (r + c) % 2){
                    graph[i][j] = 'v';
                }else{
                    graph[i][j] = '.';
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(new String(graph[i]));
        }
    }
}