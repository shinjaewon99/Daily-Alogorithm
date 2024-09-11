import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int[][] store = new int[100][100];
        int result = 0;

        for(int i = 0; i < number; i++){
            int x = in.nextInt();
            int y = in.nextInt();

            // 색종이를 칠해 준다, 겹치는 부분도 1로 초기화
            for(int j = x; j < x + 10; j++){
                for(int k = y; k < y + 10; k++){
                    store[j][k] = 1;
                }
            }
        }

        // 칠한 색종이의 넓이를 구한다
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(store[i][j] == 1) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
