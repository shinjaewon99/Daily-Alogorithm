import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        StringBuilder output = new StringBuilder();

        while(t --> 0){
            int n = in.nextInt(); // 국가의 수
            int m = in.nextInt(); // 비행기의 종류

            for(int i = 0; i < m; i++){
                int a = in.nextInt();
                int b = in.nextInt();
            }

            output.append(n - 1).append("\n");
        }

        System.out.println(output.toString());
    }
}