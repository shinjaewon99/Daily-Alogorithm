import java.util.*; 
class Main { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        int t = in.nextInt(); 
        in.nextLine(); 
        
        Map<String, Integer> store = new HashMap<>(); 
        
        for(int i = 0; i < t; i++){ 
            String[] words = in.nextLine().split(" "); 
            store.put(words[0], Integer.parseInt(words[1])); 
        } 
        
        List<String> lists = new ArrayList<>(store.keySet()); 
        lists.sort((a, b) -> { 
            int cmp = store.get(b) - store.get(a); 
            if(cmp == 0) return a.compareTo(b); // 점수가 같은경우 
            return cmp; 
        });
        
        System.out.println(lists.get(0)); 
    } 
}