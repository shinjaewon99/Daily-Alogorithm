import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int loop = in.nextInt();

        for(int i = 0; i < loop; i++){
            long number = in.nextLong();

            // 1000000 보다 큰 소수인지 판별
            for(int j = 2; j <= 1000000; j++){
                if(number % j == 0){
                    System.out.println("NO");
                    break;
                }

                if(j == 1000000){
                    System.out.println("YES");
                }
            }
        }
        
    }
}
