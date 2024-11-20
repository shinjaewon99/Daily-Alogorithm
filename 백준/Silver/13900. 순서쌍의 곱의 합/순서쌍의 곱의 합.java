import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); 
        int[] store = new int[n];

        for(int i = 0; i < n; i++){
            store[i] = in.nextInt();
        }

        long total = 0;
        long temp = 0;

        // 입력값이 1,2,3,4 인경우
        // 0 + (1)2 + (1+2)3 + (1+2+3)*4 = 35
        for(int i = 0; i < n; i++){
            total += temp * store[i];
            temp  += store[i];
        }

        System.out.println(total);
    }
}