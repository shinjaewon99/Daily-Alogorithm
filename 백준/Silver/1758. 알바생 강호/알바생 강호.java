import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();


        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        long sum = 0;
        int index = 0;
        int [] reverse = new int [arr.length];

        // 최대값 저장을 위해 역순
        for (int j = arr.length - 1; j >= 0; j--) {
            reverse[index] = arr[j];
            index++;
        }
        for(int k = 0; k < size; k++){
            if(reverse[k] - k <= 0){
                break;
            }
            sum += reverse[k] - k;
        }
        System.out.print(sum);
    }
}
