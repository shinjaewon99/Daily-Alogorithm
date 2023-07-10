import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        long [] n = new long [size - 1];
        long [] m = new long [size];
        int count = 0;
        for(int i = 0; i < n.length; i++){
            n[i] = in.nextInt(); // 거리
        }

        for(int i = 0; i < m.length; i++){
            m[i] = in.nextInt(); // 가격
        }


        // 주유 최소 비용을 담는다.
        long min = m[0];

        for(int i = 0; i < n.length; i++){

            // 현재 주유 가격 보다, 다음의 주유 가격이 더 쌀 경우 min 갱신
            if(m[i] < min){
                min = m[i];
            }
            count += min * n[i];
        }
        System.out.print(count);
    }
}
