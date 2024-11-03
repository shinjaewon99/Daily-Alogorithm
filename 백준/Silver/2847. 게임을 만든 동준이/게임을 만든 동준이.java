import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputSize = in.nextInt();
        int[] store = new int[inputSize];

        for(int i = 0; i < inputSize; i++){
            store[i] = in.nextInt();
        }

        int count = 0;

        // 5 3 7 5
        for(int i = store.length - 1; i > 0; i--){

            while(store[i] <= store[i - 1]){
                store[i - 1] = store[i - 1] - 1; 
                count++;
            }
        }

        System.out.println(count);
    }
}