import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int [] arr = new int [size];
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            
            /**
             * 입력값 : size = 2 
             * 10 15 인 경우는 로프 2개를 사용하여 최대 20을 들수있다.
             */
            // 로프 한개만 사용 할수도있음으로, max값을 구해준다.
            max = Math.max(max, arr[i] * (size - i));
        }

        System.out.print(max);
    }
}
