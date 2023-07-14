
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

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
