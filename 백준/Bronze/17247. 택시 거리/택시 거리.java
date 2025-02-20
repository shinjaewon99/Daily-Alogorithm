import java.util.*;

class Main {
    private static int n; // 행의 갯수
    private static int m; // 열의 갯수
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        List<int[]> graph = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int index = in.nextInt();

                if(index == 1){
                    graph.add(new int[]{i, j});
                }
            }
        }

        // 출발지 1의 위치
        int x1 = graph.get(0)[0];
        int y1 = graph.get(0)[1];

        // 도착지 1의 위치
        int x2 = graph.get(1)[0];
        int y2 = graph.get(1)[1];

        System.out.println(Math.abs(x2 - x1) + Math.abs(y2 - y1));
    }
}
