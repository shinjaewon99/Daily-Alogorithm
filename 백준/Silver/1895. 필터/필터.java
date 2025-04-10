import java.util.*;

class Main {
    private static int r;
    private static int c;

    private static int[][] graph;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        r = in.nextInt();
        c = in.nextInt();

        graph = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                graph[i][j] = in.nextInt();
            }
        }

        int find = in.nextInt();
        int result = 0;

        List<Integer> store = new ArrayList<>();
       
        for(int i = 0; i <= r - 3; i++)
            for(int j = 0; j <= c - 3; j++){
                for(int x = i; x < i + 3; x++){
                    for(int y = j; y < j + 3; y++){
                        store.add(graph[x][y]);
                    }
                }

                Collections.sort(store);

                if(store.get(4) >= find){
                    result += 1;
                }
                store.clear();
            }
            System.out.println(result);
        }
}