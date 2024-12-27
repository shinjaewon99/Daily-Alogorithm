import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true){
            int number = in.nextInt();
            if(number == 0) break;
            int count = 0;
            
            boolean[] flag = new boolean[(2 * number) + 1];
    
            // 0과 1은 소수가 아님
            flag[0] = true;
            flag[1] = true;

            for (int i = 2; i * i <= 2 * number; i++) {
                if (!flag[i]) {
                    for (int j = i * i; j <= 2 * number; j += i) {
                        flag[j] = true;
                    }
                }
            }

            // 소수 갯수
            for(int i = number + 1; i <= 2 * number; i++){
                if(!flag[i]) count++;
            }

            System.out.println(count);
        }
    }
}