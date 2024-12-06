import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 물이 새는곳 갯수
        int l = in.nextInt(); // 테이프의 길이

        int[] store = new int[n];

        for(int i = 0; i < n; i++){
            store[i] = in.nextInt();
        }

        Arrays.sort(store);

        int result = 0;
        int compare = 0;
        for(int i = 0; i < n; i++){

            if(store[i] > compare){
                result++;
                compare = store[i];


                // 왼쪽 오른쪽으로 0.5씩 포함 할수 있음
                // 구멍이 1이고 테이프길이가 2일 경우 
                // 1 2 3 입력값 일때 테이프 1개로 커버가 됨
                compare += l - 1;
            }
        }

        System.out.println(result);
    }
}