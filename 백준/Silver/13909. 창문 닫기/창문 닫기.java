import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        // 약수가 홀수 인 경우만 창문이 열려있음

        System.out.println((int)Math.sqrt(number));
    }
}
