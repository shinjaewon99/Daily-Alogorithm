import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 첫번째 분수
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        // 두번째 분수
        int m1 = in.nextInt();
        int m2 = in.nextInt();

        int total1 = (n1 * m2) + (n2 * m1);
        int total2 = n2 * m2;

        // 최대 공약수 구하기
        int calcu = gcd(total1, total2);

        total1 /= calcu;
        total2 /= calcu;

        System.out.println(total1 + " " +  total2);
    }

    private static int gcd(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
        
    }
}