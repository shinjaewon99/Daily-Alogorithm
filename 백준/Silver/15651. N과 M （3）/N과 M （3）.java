import java.util.*;
class Main {
    private static int n;
    private static int m;
    private static int[] graph;
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        graph = new int[m];

        back(0);

        System.out.print(sb.toString());
    }

    private static void back(int depth){
        if(m == depth){
            for(int result : graph){
                sb.append(result).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 항상 끝까지 탐색
        for(int i = 1; i <= n; i++){
            graph[depth] = i;
            back(depth + 1);
        }
    }
}