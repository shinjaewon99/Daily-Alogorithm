import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

       // 코드1은 for문에서 n번 수행
        System.out.println(n);

        // 다항식 O(n) = n 이므로 차수는 1
        System.out.println(1);
    }
}