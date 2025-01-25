import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수

        for(int i = 0; i < t; i++){
            int v = in.nextInt();
            int e = in.nextInt();

            int result = 2;
            int cacl = v - e;

            System.out.println(Math.abs(cacl) + result);
        }
    }
}
