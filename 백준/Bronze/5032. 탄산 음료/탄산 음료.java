import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int e = in.nextInt(); // 빈병의 수
        int f = in.nextInt(); // 그날 발견한 빈병의 수
        int c = in.nextInt(); // 새 병을 바꾸는데 필요한 병의 수

        int sum = e + f;
        int result = 0;
        
        while(sum >= c){
            int div = sum / c;
            result += div;
            sum = div + (sum % c); // 마신 음료병 
        }

        System.out.println(result);
    }
}