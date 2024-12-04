import java.util.*;

class Main {
    private static int NUMBER;
    private static int[] STORE;
    private static boolean[] FLAG;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NUMBER = in.nextInt();
        FLAG = new boolean[NUMBER + 1];
        STORE = new int[NUMBER];

        back(0); // 0 depth부터 시작
    }

    private static void back(final int depth){

        if(NUMBER == depth){
            for(int i = 0; i < NUMBER; i++){
                System.out.print(STORE[i] + " ");
            }
            System.out.println();
            return;
        }
        

        // 백트래킹 탐색
        for(int i = 1; i <= NUMBER; i++){
            if(!FLAG[i]){
                FLAG[i] = true;
                STORE[depth] = i;
                back(depth + 1);
                FLAG[i] = false;
            }
        }
    }
}