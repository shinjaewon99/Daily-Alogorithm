/*
* 문제
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
주어진 수들 중 소수의 개수를 출력한다.

예제 입력 1
4
1 3 5 7
예제 출력 1
3
* */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num;
        int count = 0;
        // N까지 num을 대입 받고 반복한다.
        for(int i=0; i<N; i++){
            // num을 N의 갯수만큼 받는다.
            num = sc.nextInt();

            // 2부터 num까지 나눈다.
            for(int j=2; j<=num; j++){
                // 만약 j하고 num이 같으면 자기 자신까지 온 거니까 count++ 한다.
                if(j==num) {
                    count++; // j가 num하고 같지 않으면 밑으로 내려간다.
                }
                if(num%j==0){// 만약 num을 j나눈 나머지가 0이되면 빠져 나온다.
                    break;
                }
            }
        }
        System.out.println(count);
    }
}