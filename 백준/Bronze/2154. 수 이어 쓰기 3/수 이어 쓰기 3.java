import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        StringBuilder words = new StringBuilder();

        for(int i = 1; i <= n; i++){
            words.append(i);
        }

        // 해당 숫자 위치 인덱스 반환
        int index = words.indexOf(String.valueOf(n));
        
        System.out.println(index + 1);
    }
}