import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int[][] store = new int[number][2];
        
        for(int i = 0; i < number; i++){
            store[i][0] = in.nextInt(); // 콘도와 바다의 거리
            store[i][1] = in.nextInt(); // 콘도의 가격
        }

        int count = 0;

        // 조건 1 : 기준이 되는 X보다 가까우면 X보다 숙박비가 더 비싸다
        // 조건 2 : 기준이 되는 X보다 숙박비가 비싸면 X보다 더 멀다

        for(int i = 0; i < number; i++){
            boolean flag = true;
            for(int j = 0; j < number; j++){

                if(i == j) continue;
                
                // 거리가 가까울때
                if(store[i][0] >= store[j][0]){
                    if(store[i][1] >= store[j][1]){
                        flag = false;
                        continue;
                    }
                }

                if(store[i][1] >= store[j][1]){
                    if(store[i][0] >= store[j][0]){
                        flag = false;
                        continue;
                    }
                }
            }

            if(flag) count++;
        }
        
        System.out.println(count);
    }
}
