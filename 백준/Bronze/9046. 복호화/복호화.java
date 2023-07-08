import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        in.nextLine(); // 개행 제거

        while(size --> 0){
            String str = in.nextLine();
            int[] arr = new int[26];
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if(ch >= 'a' && ch <= 'z'){
                    arr[ch - 'a']++;
                }
            }
            int max = 0;
            for (int contain : arr) {
                if(contain > max){
                    max = contain;
                }
            }

            int count = 0;
            int index = 0;
            // 동일한 갯수의 문자가 있는지 확인
            for (int i = 0; i < 26; i++) {
                if(max == arr[i]){
                    count++;
                    index = i;
                }
            }

            // 동일한 문자 갯수가 최대인 문자가 한개인 경우
            if(count == 1){
                System.out.println((char) (index + 'a'));
            }else{
                System.out.println("?");
            }
        }
    }
}
