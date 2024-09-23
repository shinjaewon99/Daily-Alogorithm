import java.util.*;
class Main {
    private static final int MAX_INDEX = 101;
    private static final boolean[][] store = new boolean[MAX_INDEX][MAX_INDEX];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 4; i++){
            int a1 = in.nextInt();
            int a2 = in.nextInt();
            int a3 = in.nextInt();
            int a4 = in.nextInt();
            
            fill(a1, a2, a3, a4);
        }

        System.out.println(result());
    }

    private static void fill(int a1, int a2, int a3, int a4) {

        // 주어진 x,y 좌표에 대해 배열에 채우기
        for(int i = a1; i < a3; i++){
            for(int j = a2; j < a4; j++){
                store[i][j] = true;  
            }
        }
    }

    private static int result(){
        int sum = 0;

        for(int i = 0; i < MAX_INDEX; i++){
            for(int j = 0; j < MAX_INDEX; j++){
                if (store[i][j]) {
                    sum++;
                }
            }
        }

        return sum;
    }
}
