import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputSize = in.nextInt();
        int[] store1 = new int[inputSize];
        int[] store2 = new int[inputSize];
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < inputSize; i++){
            store1[i] = in.nextInt();
            store2[i] = store1[i]; 
        }

        Arrays.sort(store2);

        // 2 1 3 1
        // 1 1 2 3
        for(int i = 0; i < inputSize; i++){
            for(int j = 0; j < inputSize; j++){
                if(store1[i] == store2[j]){
                    output.append(j).append(" ");
                    // 중복 체크를 방지
                    store2[j] = -1;
                    break;
                }
            }
        }

        System.out.println(output.toString());
    }
}