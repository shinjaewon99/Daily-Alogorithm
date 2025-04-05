import java.util.*;

class Main {
    // 관중석 크기
    private static int n;
    private static int m;

    private static int k; // 관중석 번호
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt(); 

        int index = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(index == k){
                    System.out.print(i + " " + j);
                    return;
                }
                index++;
            }
        }
    }
}
