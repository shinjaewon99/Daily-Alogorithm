import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int[][] store = new int[number][2];

        for(int i = 0; i < number; i++){
            store[i][0] = in.nextInt();
            store[i][1] = in.nextInt();
        }

        Arrays.sort(store, (int[] o1, int[] o2) -> {
            // X 좌표가 같을 경우
            if(o1[0] == o2[0]){
                return o1[1] - o2[1];
           }else{
                return o1[0] - o2[0];
           }
        });

        for(int i = 0; i < number; i++){
            System.out.println(store[i][0] + " " + store[i][1]);
        }
        
    }
}
