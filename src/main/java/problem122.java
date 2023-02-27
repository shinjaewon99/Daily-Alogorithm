/*
문제 설명
5*5 격자판에 아래와 같이 숫자가 적혀있습니다.

N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

​

▣ 입력설명

첫 줄에 자연수 N이 주어진다.(1<=N<=50)

두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다.

각 자연수는 100을 넘지 않는다.

​

▣ 출력설명

최대합을 출력합니다.

​

▣ 입력예제 1



▣ 출력예제 1

155
*/

import java.util.Scanner;

public class problem122 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        int [][] arr = new int[size][size];
        for(int i = 0; i <size; i++){
            for(int j = 0; j < size; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int answer = Integer.MIN_VALUE;
        int sum1;
        int sum2;
        for(int i = 0; i < size; i++){
            sum1 = sum2 = 0;
            for(int j = 0; j < size; j++){
                sum1 += arr[i][j]; // 행 고정, 열 이동
                sum2 += arr[j][i]; // 행 이동, 열 고정
            }
            answer = Math.max(answer,sum1);
            answer = Math.max(answer,sum2);
        }

        int cross = 0;
        int reverseCross =0;
        for (int i = 0; i < size; i++) {
            cross += arr[i][i]; // 대각선을 구하는 로직
            reverseCross += arr[i][size-i-1];
        }
        answer = Math.max(answer, cross);
        answer = Math.max(answer, reverseCross);
        System.out.print(answer);
    }
}



