import java.util.*;

class Main {
    private static int n;
    private static int m;
    private static int[] graph;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        graph = new int[m];

        back(1, 0);
        
    }

    private static void back(int index, int depth){

        // 끝까지 다 탐색했을 경우
        if(depth == m){
            for(int number : graph){
                System.out.print(number + " ");
            }
            System.out.println();
            return;
        }

        for(int i = index; i <= n; i++){
            graph[depth] = i;
            back(i, depth + 1);
        }
    }
}