import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt(); // 랜선의 갯수
        int contain = in.nextInt(); // 오영식이 이미 가지고 있는 랜선

        int[] lan = new int[size];
        long max = 0;
        for (int i = 0; i < size; i++) {
            lan[i] = in.nextInt();
            if(max < lan[i]){
                max = lan[i];
            }

        }
        long mid = 0;

        /**
         * 입력 예시
         * 4 11
         * 802
         * 743
         * 457
         * 539
         * 중간값이 199이여도 11개의 필요한 랜선 갯수가 반환된다.
         * 하지만 199이 최대값이 아니라 중간값이 200이여도 11개가 반환됨으로 최대값은 200이다.
         */
        long min = 1;
        while (min <= max) {
            // 입력값이 1 1
            //        1 이면은 최대 길이는 1이다.
            mid = (max + min) / 2;
            int count = 0;
            // 자른 랜선의 갯수 누적합
            for (int i = 0; i < size; i++) {
                count += lan[i] / mid;
            }

            // 자른 랜선 갯수의 누적합이 필요한 랜선의 갯수보다 작을경우
            if(count < contain){
                max = mid - 1;
            }
            // 자른 랜선의 갯수의 누적합이 필요한 랜선의 갯수보다 크거나 같을경우
            else{
                min = mid + 1;
            }
        }

        System.out.println(max);
    }
}
