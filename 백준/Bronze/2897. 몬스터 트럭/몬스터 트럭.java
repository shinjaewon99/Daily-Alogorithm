import java.util.*;

class Main {
    private static int r; // 행의 갯수
    private static int c; // 열의 갯수
    private static char[][] graph;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        r = in.nextInt();
        c = in.nextInt();

        graph = new char[r][c];

        for(int i = 0; i < r; i++){
            String word = in.next();
            for(int j = 0; j < c; j++){
                graph[i][j] = word.charAt(j);
            }
        }

        int[] result = new int[5];

        for(int i = 0; i < r - 1; i++){
            for(int j = 0; j < c - 1; j++){
                if(isHouse(graph, i, j)){
                    int count = isPark(graph, i, j);
                    result[count]++;
                }
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.println(result[i]);
        }
    }

    private static boolean isHouse(char[][] graph, int x, int y){

        for(int i = x; i <= x + 1; i++){
            for(int j = y; j <= y + 1; j++){
                if(graph[i][j] == '#'){
                    return false;
                }
            }
        }
        return true;
    }

    private static int isPark(char[][] graph, int x, int y){
        int count = 0;
        for(int i = x; i <= x + 1; i++){
            for(int j = y; j <= y + 1; j++){
                // 자동차가 있을경우
                if(graph[i][j] == 'X'){
                    count++;
                }
            }
        }

        return count;
    }
}
