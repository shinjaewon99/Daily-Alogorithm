import java.util.*;

class Main {
    private static int n;
    private static int l;
    private static int r;
    private static int x;

    private static int[] numbers;

    private static int count;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); // 문제의 갯수
        l = in.nextInt(); // 문제 난이도의 합
        r = in.nextInt();
        x = in.nextInt(); // 가장 어려운 문제와 가장 쉬운 문제의 난이도 차이

        numbers = new int[n];

        count = 0;
    
        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);
        result(0, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.println(count);
    }

    private static void result(int index, int cnt, int sum, int max, int min){
        // 값에 대한 조건 확인
        if(cnt >= 2){
            if(sum >= l && sum <= r && max - min >= x){
                count++;
            }
        }

        for(int i = index; i < n; i++){
            result(i + 1, cnt + 1, sum + numbers[i], Math.max(max, numbers[i]), Math.min(min, numbers[i]));
        }
    }
}