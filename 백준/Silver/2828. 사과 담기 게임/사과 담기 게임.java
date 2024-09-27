import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 스크린 크기
        int m = in.nextInt(); // 바구니 크기
        int apple = in.nextInt(); // 사과 갯수

        int left = 1; // 바구니의 왼쪽 좌표
        int right = m; // 바구니의 오른쪽 좌표 (바구니의 크기 끝의 좌표가 오른쪽 좌표)
        int total = 0;


        for(int i = 0; i < apple; i++){
            int temp = in.nextInt();

            // 바구니 안쪽에 떨어진 경우
            if(left <= temp && temp <= right){
                continue;
            }
            // 바구니 왼쪽에 가깝게 떨어지는 경우
            if(left > temp){
                total +=(left - temp);
                right -= (left - temp);
                left = temp;

            }
            // 바구니 오른쪽에 가깝게 떨어지는 경우
            else{
                total += (temp - right);
                left += (temp - right); // 왼쪽 좌표 갱신
                right = temp;
            }
        }
        System.out.print(total);
    }
}