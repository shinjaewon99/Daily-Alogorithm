import java.util.*; 
class Main { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        int t = in.nextInt(); // 학생수 
        in.nextLine(); 
        
        Map<String, Integer> store = new HashMap<>(); // 초기값 세팅 
        String[] words = in.nextLine().split(" "); 
        
        for(String word : words){ 
            store.put(word, 0); 
        } 
        for(int i = 1; i <= t; i++){ 
            String[] inputs = in.nextLine().split(" "); 
            
            for(String input : inputs){ 
                store.put(input, store.get(input) + 1); 
            } 
        } 
        
        List<String> students = new ArrayList<>(Arrays.asList(words)); 
        
        students.sort((a, b) -> { 
            int cmp = store.get(b) - store.get(a); // 인기도 내림차순 
            if(cmp == 0) return a.compareTo(b); // 같으면 이름 오름차순 
            return cmp; 
        }); 
        
        for(String student : students){ 
            System.out.println(student + " " + store.get(student)); 
        } 
    } 
}