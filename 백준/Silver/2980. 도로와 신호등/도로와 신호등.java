import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 신호등의 갯수
        int l = in.nextInt(); // 도로의 길이

        int result = 0;
        int index = 0;
       
        for(int i = 0; i < n; i++){
            int d = in.nextInt();
            int r = in.nextInt();
            int g = in.nextInt();

            result += d - index;
            index = d;

            // 아직 기다리고 있음
            int gap = result % (r + g);
            if(gap < r) result += r - gap;
        }

        result += l - index;

        System.out.println(result);
    }
}