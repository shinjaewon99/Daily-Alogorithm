import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        in.nextLine();

        char[][] graph = new char[x][y];

        for(int i = 0; i < x; i++){
            String line = in.nextLine();
            for(int j = 0; j < y; j++){
                graph[i][j] = line.charAt(j);
            }
        }


        int rowCount = 0;
        int colCount = 0;

        for(int i = 0; i < x; i++){
            boolean flag = false;

            for(int j = 0; j < y; j++){
                if(graph[i][j] == 'X'){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                rowCount++;
            }
        }

        for(int i = 0; i < y; i++){
            boolean flag = false;

            for(int j = 0; j < x; j++){
                if(graph[j][i] == 'X'){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                colCount++;
            }
        }

        System.out.println(Math.max(rowCount, colCount));
    }
}