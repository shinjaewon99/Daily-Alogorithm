import java.util.*; 

class Main { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        
        int n = in.nextInt(); // 나무의 갯수 
        int[] t = new int[n]; 
        int[] m = new int[n]; 
        
        for(int i = 0; i < n; i++){ 
            t[i] = in.nextInt(); 
        } 
        
        for(int i = 0; i < n; i++){ 
            m[i] = in.nextInt(); 
        } 
        
        // 한쌍 씩 저장 (t, m) 
        int[][] trees = new int[n][2]; 
        
        for(int i = 0; i < n; i++){ 
            trees[i][0] = t[i]; trees[i][1] = m[i]; 
        } 
        
        // 성장량을 기준으로 오름차순 
        Arrays.sort(trees, (a,b) -> { 
            return Integer.compare(a[1], b[1]); 
        }); 
        
        long total = 0; 
        for(int i = 0; i < n; i++){ 
            total += trees[i][0] + (i * trees[i][1]); 
        } 
        
        System.out.println(total); 
    } 
}