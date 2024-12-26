import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        long[] store = new long[t];
        long[] compare = new long[t];
        int[] result = new int[t];

        for(int i = 0; i < t; i++){
            store[i] = in.nextLong();
        }

        for(int i = 0; i < t; i++){
            compare[i] = in.nextLong();
        }

        // 통로와 롤러의 점도를 비교
        for(int i = 0; i < t; i++){
            int start = i + 1;
            int end = t - 1;
            int maxIndex = i;

            while(start <= end){
                int mid = (start + end) / 2;

                if(compare[mid] <= store[i]){
                    maxIndex = mid; // 가능한 인덱스 갱신
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            
            result[i] = maxIndex - i;
        }

        for(int answer : result){
            System.out.print(answer + " ");
        }
    }
}