import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);

        for(int i = 0; i < m; i++){
            int find = in.nextInt();
            int index = findResult(numbers, find);
            System.out.println(index);
        }
    }

    private static int findResult(int[] numbers, int find){
        int left = 0;
        int right = numbers.length - 1;
        int result = -1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(numbers[mid] >= find){
                if(numbers[mid] == find){
                    result = mid;
                }
                right = mid - 1; // 더 작은 인덱스에 존재
                
            }else{
                left = mid + 1;
            }
        }

        return result;
    }
}