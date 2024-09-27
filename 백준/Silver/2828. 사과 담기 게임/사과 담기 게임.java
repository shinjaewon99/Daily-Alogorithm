import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt(); // 바구니 크기
        int apple = in.nextInt(); // 사과 갯수

        int left = 1;
        int right = m; // 끝 좌표가 바구니 크기
        int result = 0;

        for(int i = 0; i < apple; i++){
            int compare = in.nextInt();

            // 바구니 안쪽에 떨어진 경우
            if(left <= compare &&  compare <= right){
                continue;
            }

            // 바구니 왼쪽에 떨어진경우
            if(left > compare){
                result += left - compare;
                right -= left - compare;
                left = compare;
            }
             // 바구니 오른쪽에 떨어진 경우
             else{
                result += compare - right;
                left += compare - right;
                right = compare; // 오른쪽 좌표 갱신
                
            }
        }
        System.out.println(result);
    }
}
