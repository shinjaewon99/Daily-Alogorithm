import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 센서의 갯수
        int k = in.nextInt(); // 집중국의 갯수

        // 집중국의 갯수가 센서의 갯수보다 많은경우, 각각의 센서에 각각 집중국이 담당
        if(k >= n){
            System.out.println(0);
            return;
        }

        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);

        // 1 3 6 6 7 9

        Integer[] minusNum = new Integer[n - 1];
        for(int i = 0; i < n - 1; i++){
            minusNum[i] = numbers[i + 1] - numbers[i];
        }

        Arrays.sort(minusNum, Collections.reverseOrder());

        int result = 0;

        for(int i = k - 1; i < n - 1; i++){
            result += minusNum[i];
        }

        System.out.println(result);
    }
}