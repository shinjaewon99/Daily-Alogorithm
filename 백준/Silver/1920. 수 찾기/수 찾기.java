import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int[] numbers = new int[x];

        for(int i = 0; i < x; i++){
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);
        int m = in.nextInt();
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < m; i++){
            if(search(numbers, in.nextInt())){
                output.append("1").append("\n");
            }else{
                output.append("0").append("\n");
            }
        }

        System.out.println(output.toString());
    }

    // 이분 탐색 함수
    private static boolean search(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (numbers[mid] == target) {
                return true;
            } else if (numbers[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }   
}