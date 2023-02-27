/*
문제 설명 (투 포인터로 해결)
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

입력

첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.

각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.



출력

오름차순으로 정렬된 배열을 출력합니다.

예시 입력

3
1 3 5
5
2 3 6 7 9
예시 출력

1 2 3 3 5 6 7 9
*/
import java.util.ArrayList;
import java.util.Scanner;

public class problem123 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> answer = new ArrayList<>();

        int aSize = in.nextInt();
        int [] arr = new int[aSize];
        for(int i = 0; i < aSize; i++){
            arr[i] = in.nextInt();
        }

        int bSize = in.nextInt();
        int [] brr = new int[bSize];
        for(int i = 0; i < bSize; i++){
            brr[i] = in.nextInt();
        }

        int p1= 0, p2 = 0;
        while(p1 < aSize && p2 < bSize ){
            // p1이 가르키는 값을 add하고 그 다음 p1++이 된다.
            if(arr[p1] < brr[p2]) {
                answer.add(arr[p1++]);
            }
            // brr배열이 더작은값인 경우
            else{
                answer.add(brr[p2++]);
            }
        }
        // 위의 조건중 p2 < bSize가 만족하지 못하는 조건일경우
        // 아직까지 이 조건은 유효하다.
        while(p1 < aSize){
            answer.add(arr[p1++]);
        }

        // 위 로직과 마찬가지.
        while(p2 < bSize){
            answer.add(brr[p2++]);
        }
        for(int result : answer){
            System.out.print(result + " ");
        }

    }
}



