import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 수열의 크기
        int[] store = new int[n];

        for(int i = 0; i < n; i++){
            store[i] = in.nextInt();
        }

        int find = in.nextInt();
        Arrays.sort(store);

        int result = 0;
        // 투포인터
        int left = 0;
        int right = store.length - 1;

        while(left < right){
            int sum = store[left] + store[right];
            if(sum == find){
                result++;
                left++;
                right--;
            }
            // 찾는값이 sum보다 큰 경우
            else if(sum < find){
                left++;   
            }else {
                right--;
            }
        }

        System.out.println(result);
    }
}