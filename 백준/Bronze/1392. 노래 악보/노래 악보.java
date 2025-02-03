import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 악보의 갯수
        int q = in.nextInt(); // 질문의 갯수

        int[] numbers = new int[n];
        int[] target = new int[10000];

        int time = 0; // 시간을 추적
        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
            for(int j = 0; j < numbers[i]; j++){
                target[time++] = i + 1;
            }
        }

        for(int i = 0; i < q; i++){
            int find = in.nextInt();
            System.out.println(target[find]);
        }
    }
}