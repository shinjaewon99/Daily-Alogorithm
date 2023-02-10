/*
* */

import java.util.Scanner;

public class problem56 {
    public static void main(String[] args) {
        // 간단한 배열 문제다.
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] array= new int[size];

        int count = 0;
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        // 입력된 숫자와 match 하여 같으면 count 증가
        int match = in.nextInt();
        for (int i = 0; i < size; i++) {
            if(array[i] == match){
                count++;
            }
        }
        System.out.println(count);
    }
}

