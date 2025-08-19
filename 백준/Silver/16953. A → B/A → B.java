import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();

        int cnt = 1;

        while(b > a){
            // 끝자리가 1인 경우 1제거
            if(b % 10 == 1){
                b /= 10;
            }
            // 짝수면 2로 나누기
            else if (b % 2 == 0){
                b /= 2;
            }else{
                break;
            }
            cnt++;
        }

        if(b == a){
            System.out.println(cnt);
        }else{
            System.out.println(-1);
        }
    }
}