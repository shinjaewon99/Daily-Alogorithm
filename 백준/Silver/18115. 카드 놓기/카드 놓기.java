import java.util.*; 

class Main { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>(); 
        
        int n = in.nextInt(); 
        int[] store = new int[n]; 
        
        for(int i = 0; i < n; i++){
            store[i] = in.nextInt(); 
        } 
        
        for(int i = 1; i <= n; i++){ 
            switch (store[n - i]) { 
                case 1: deque.addFirst(i); 
                    break; 
                case 2: 
                    // 맨 위의 값을 추출후 다시 쌓는다 
                    int temp = deque.pollFirst(); 
                    deque.addFirst(i); 
                    deque.addFirst(temp); 
                    break; 
                case 3: deque.addLast(i); 
                    break;
            } 
        } 
        
        StringBuilder output = new StringBuilder(); 
        
        for(int i = 0; i < n; i++){ 
            output.append(deque.pollFirst()).append(" "); 
        } 
        
        System.out.println(output.toString());
    } 
}