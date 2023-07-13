import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++) {
            String st = in.next();
            boolean check = check(st);
            if(check == true){
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean check(String st) {
        // 알파벳 배열 선언
        boolean [] arr = new boolean [26];
        int temp = 0;


        for (int i = 0; i < st.length(); i++) {
            // 현재 문자의 아스키코드값
            int now = st.charAt(i);

            /**
             * aaba 값이 입력 되었을때
             * a는 temp의 값이랑 달라 if문에 걸려 들어간다
             * 다음 a는 temp랑 now의 값이 같음으로 걸러들어가지않는다.
              */

            if(temp != now){
                // 해당 문자가 처음 등장한 경우 (false인경우), boolean 타입은 초기 설정값이 false이다.
                if(arr[now - 'a'] == false){
                    // 해당 문자가 처음 등장한경우 true로 변경해준다
                    arr[now - 'a'] = true;
                    temp = now;
                }
                // 해당 문자가 처음 등장하지 않은 경우
                else{
                    return false;
                }
            }

        }
        return true;
    }
}


