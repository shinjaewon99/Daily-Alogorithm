/*
문제
서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?

입력
첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.

출력
첫째 줄에 자연수 N의 최댓값을 출력한다.

예제 입력 1
200
예제 출력 1
19
*/
import java.util.*;
public class problem141 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        long sum = 0L;
        if(n == 1 || n == 2){
            System.out.print(1);
            return;
        }
        for(int i = 0; i < n; i++){
            sum += i;
            if(sum > n){
                // 1부터 순서대로 더하면 210이라는 값이 나온다
                // 최대 갯수로 200을 만들수 있는 수 이니까 1 ~ 20 까지 더한후, 10을 빼주면된다 (갯수1개).
                System.out.print(i - 1);
                break;
            }else if (sum == n){
                System.out.print(i);
                break;
            }
        }

    }
}

