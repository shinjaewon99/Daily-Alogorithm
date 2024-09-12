import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();

        int[] store = new int[10];
        int count = 0;
        for(char num : number.toCharArray()){
            int compare = Integer.parseInt(String.valueOf(num));
            if(compare == 9){
                store[6]++;
            }else{
                store[compare]++;
            }
        }

        // 6과 9의 세트 수는 합쳐서 2로 나눈 값 (홀수일 경우 반올림)
        store[6] = (store[6] + 1) / 2;
        
        int max = 0;

        for(int i = 0; i < store.length; i++){
            max = Math.max(max, store[i]);
        }

        System.out.println(max);
        
    }
}
