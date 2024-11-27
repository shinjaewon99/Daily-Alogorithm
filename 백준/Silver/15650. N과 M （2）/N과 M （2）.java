import java.util.*;

class Main {
    private static int n;
    private static int m;
    private static int[] store;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        store = new int[m];

        dfs(1, 0);
    }

    private static void dfs(int value, int depth){

        if(m == depth){
            for(int result : store){
                System.out.print(result + " ");
            }
            System.out.println();
            return; // 해당 return이 아래의 for문으로 복귀 하는 것
        }

        for(int i = value; i <= n; i++){
            store[depth] = i;
            
            dfs(i + 1, depth + 1);
        }
    }
}