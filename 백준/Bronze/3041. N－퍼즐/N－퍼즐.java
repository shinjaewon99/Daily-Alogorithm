import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int result = 0;
        
        for(int i = 0; i < 4; i++){
            String word = in.nextLine();

            for(int j = 0; j < 4; j++){
                char alpha = word.charAt(j);

                if(alpha == '.') continue;
                int number = alpha - 'A';

                int x = number / 4;
                int y = number % 4;

                // 각 원래의 위치와 비교해서 흩어짐 정도 계산
                result += Math.abs(i - x) + Math.abs(j - y);
            }
        }
        System.out.println(result);
    }
}