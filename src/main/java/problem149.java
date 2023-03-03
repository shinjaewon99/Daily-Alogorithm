/*
문제
웅찬이는 과제가 많다. 하루에 한 과제를 끝낼 수 있는데, 과제마다 마감일이 있으므로 모든 과제를 끝내지 못할 수도 있다. 과제마다 끝냈을 때 얻을 수 있는 점수가 있는데, 마감일이 지난 과제는 점수를 받을 수 없다.

웅찬이는 가장 점수를 많이 받을 수 있도록 과제를 수행하고 싶다. 웅찬이를 도와 얻을 수 있는 점수의 최댓값을 구하시오.

입력
첫 줄에 정수 N (1 ≤ N ≤ 1,000)이 주어진다.

다음 줄부터 N개의 줄에는 각각 두 정수 d (1 ≤ d ≤ 1,000)와 w (1 ≤ w ≤ 100)가 주어진다. d는 과제 마감일까지 남은 일수를 의미하며, w는 과제의 점수를 의미한다.

출력
얻을 수 있는 점수의 최댓값을 출력한다.

예제 입력 1
7
4 60
4 40
1 20
2 50
3 30
4 10
6 5
예제 출력 1
185
*/
import java.util.Arrays;
import java.util.Scanner;

public class problem149 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int [][] arr = new int[size][2];

        for(int i = 0; i < size; i++){
            arr[i][0] = in.nextInt(); // 남은 일수
            arr[i][1] = in.nextInt(); // 과제 점수
        }
        Arrays.sort(arr, (o1,o2)->{
            // 과제 점수에 따른 내림차순
            return o2[1] - o1[1];
        });

        // 정수 범위
        int []score = new int [1001];

        for(int i = 0; i <size; i++){
            for(int j = arr[i][0];  j > 0;  j--){

                // score 배열 안에 값이 없으면(0), 이미 점수에 따라 내림차순 되어있음으로, 배열에 값을 바인딩한다.
                if(score[j] == 0){
                    score[j] = arr[i][1];
                    break;
                }
            }
        }

        int result = 0;
        for(int i = 0; i < score.length; i++){
            result += score[i];
        }
        System.out.print(result);
    }
}

