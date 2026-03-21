import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arrays = new int[n + 1];

        // 값 세팅
        for(int i = 1; i <= n; i++){
            arrays[i] = i;
        }

        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            // 투포인터 접근
            int left = a;
            int right = b;

            while(left < right){
                int temp = arrays[left];
                arrays[left] = arrays[right];
                arrays[right] = temp;

                left++;
                right--;
            }
        }

        for(int i = 1; i <= n; i++){
            System.out.print(arrays[i] + " ");
        }
    }
}