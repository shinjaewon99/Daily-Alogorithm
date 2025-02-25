import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수
        in.nextLine();
        
        for(int i = 0; i < t; i++){
            String[] numbers = in.nextLine().split(" ");
            int length = numbers.length;
            int[] store = new int[length];

            for(int j = 0; j < length; j++){
                store[j] = Integer.parseInt(numbers[j]);
            }

            System.out.println(findMax(store));
        }
        
    }

    private static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    private static int findMax(int[] arr){
        int max = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                max = Math.max(max, gcd(arr[i], arr[j]));
            }
        }

        return max;
    }
}