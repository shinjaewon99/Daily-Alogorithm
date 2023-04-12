/*
문제
어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.

A+: 4.3, A0: 4.0, A-: 3.7

B+: 3.3, B0: 3.0, B-: 2.7

C+: 2.3, C0: 2.0, C-: 1.7

D+: 1.3, D0: 1.0, D-: 0.7

F: 0.0

입력
첫째 줄에 C언어 성적이 주어진다. 성적은 문제에서 설명한 13가지 중 하나이다.

출력
첫째 줄에 C언어 평점을 출력한다.

예제 입력 1
A0
예제 출력 1
4.0
*/
import java.util.Scanner;

public class problem215 {
    public static void main(String[] args) {

        // 간단한 구현문제다.

        Scanner in = new Scanner(System.in);
        String st = in.next();
        double score = 0.0;

        switch(st){
            case "A+":
                score = 4.3;
                break;
            case "A0":
                score = 4.0;
                break;
            case "A-":
                score = 3.7;
                break;
            case "B+":
                score = 3.3;
                break;
            case "B0":
                score = 3.0;
                break;
            case "B-":
                score = 2.7;
                break;
            case "C+":
                score = 2.3;
                break;
            case "C0":
                score = 2.0;
                break;
            case "C-":
                score = 1.7;
                break;
            case "D+":
                score = 1.3;
                break;
            case "D0":
                score = 1.0;
                break;
            case "D-":
                score = 0.7;
                break;
            case "F":
                score = 0.0;
                break;
        }
        System.out.print(score);
    }
}


