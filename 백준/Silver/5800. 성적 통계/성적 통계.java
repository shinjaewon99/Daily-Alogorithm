import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
       
        
        for(int i = 0; i < test; i++){
            int num = in.nextInt();
            int[] store = new int[num];
            int largestGap = 0;
            
            for(int j = 0; j < num; j++){
                store[j] = in.nextInt();
            }

            Arrays.sort(store);

            for(int j = 0; j < num - 1; j++){
                largestGap = Math.max(largestGap, store[j + 1] - store[j]); // 값의 차이중 최대값
            }

            
            System.out.println("Class " + (i + 1));
            System.out.println("Max " + store[store.length - 1] + ", " + "Min " + store[0] + ", " + "Largest gap " + largestGap);
            
        }
       
    }
}
