import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] store = new int[n];
        
        for(int i = 0; i < n; i++){
            store[i] = in.nextInt();
        }

        Arrays.sort(store);
        int count = 0;

        // 투포인터로 접근
        int left = 0;
        int right = n - 1;

        while(left < right){
            if(store[left] + store[right] <= k){
                count++;
                left++;
                right--;
            }else{
                right--;
            }
        }
        
        System.out.println(count);
    }
}
