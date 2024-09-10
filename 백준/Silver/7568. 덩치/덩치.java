import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int[][] store = new int[number][2];

        for(int i = 0; i < number; i++){
            store[i][0] = in.nextInt(); // 몸무게
            store[i][1] = in.nextInt(); // 키
        }

        for(int i = 0; i < number; i++){
            int result = 1;
            for(int j = 0; j < number; j++){
                if(i == j) continue;
                
                if(store[i][0] < store[j][0] && store[i][1] < store[j][1]){
                    result++;
                }
            }

            System.out.print(result + " ");
        }
    }
}
