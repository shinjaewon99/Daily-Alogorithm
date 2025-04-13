import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 10진법 숫자
        int m = in.nextInt(); // 변환할 진법

        StringBuilder output = new StringBuilder();
        
        if (n == 0) {
            System.out.println(0);
            return;
        }

        while(n > 0){
            int div = n % m;

            if(div < 10){
                output.append(div); // 0 ~ 9 는 출력
            }else{
                output.append((char) ('A' + (div - 10)));
            }
            n /= m;
        }

        System.out.println(output.reverse().toString());
    }
}