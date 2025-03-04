import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수

        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            int[] aNumbers = new int[a];
            int[] bNumbers = new int[b];

            for(int j = 0; j < a; j++){
                aNumbers[j] = in.nextInt();
            }

            for(int k = 0; k < b; k++){
                bNumbers[k] = in.nextInt();
            }

            Arrays.sort(aNumbers);
            Arrays.sort(bNumbers);
            
            System.out.println(getCount(aNumbers, bNumbers));
        }
    }

    private static int getCount(int[] aNumbers, int[] bNumbers){
        int count = 0;

        for(int i = 0; i < aNumbers.length; i++){
            for(int j = 0; j < bNumbers.length; j++){
                if(aNumbers[i] > bNumbers[j]){
                    count++;
                }
            }
        }

        return count;
    }
}