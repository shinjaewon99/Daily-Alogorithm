import java.util.*;

class Main {
    private static int n;
    private static int k;
    private static int[] numbers;
    private static boolean[] visit;
    private static Set<String> store = new HashSet<>();
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        k = in.nextInt();

        numbers = new int[n];
        visit = new boolean[n];
        
        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        dfs("", 0);
        System.out.println(store.size());
    }

    private static void dfs(String word, int depth){
        if(k == depth){
            store.add(word);
            return; // dpeth와 선택한 정수의 갯수가 같을경우 return
        }

        for(int i = 0; i < n; i++){
            if(!visit[i]){
                visit[i] = true; // 방문 처리
                dfs(word + numbers[i], depth + 1);
                visit[i] = false; // 12 와 21은 다르므로, 방문이 다 끝나면 false 처리
            }
        }
    }
}