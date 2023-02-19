/*
문제
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로
단, 중복된 단어는 하나만 남기고 제거해야 한다.

입력
첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.

출력
조건에 따라 정렬하여 단어들을 출력한다.

예제 입력 1
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours
예제 출력 1
i
im
it
no
but
more
wait
wont
yours
cannot
hesitate
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class problem100 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        int size = in.nextInt();


        String [] arr = new String[size];

        /**
         * 개행 버림 (Scanner로 입력받을시 nextInt()로 정수를 받은뒤 nextLine()을 쓰면 개행에 저장됨,
         * (개행을 한번 버려야 정상적으로 작동)
         */
        in.nextLine();

        for(int i = 0; i<size; i++) {
            arr[i] = in.nextLine();
        }

        Arrays.sort(arr,new Comparator<String>() {
            public int compare(String s1, String s2) {

                // 정수형으로 비교, compare은 기본적으로 정수형으로 비교해줘야된다.
                // 사전순으로 출력 (아스키 값)
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else {
                    // 단어 길이순으로 정렬
                    return Integer.compare(s1.length(), s2.length());
                }
            }
        });


        // 길이 비교가 끝난 배열 첫번째를 출력
        System.out.println(arr[0]);

        // 앞에있는 배열의 값이랑 비교 (중복 되지 않는 단어만 출력)
        for(int i = 1; i < size; i++) {
            if(!(arr[i].equals(arr[i-1]))) {
                System.out.println(arr[i]);
            }
        }

    }
}

