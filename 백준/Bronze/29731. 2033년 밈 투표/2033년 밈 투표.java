import java.util.*;
    
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> store = new ArrayList<>();
        store.add("Never gonna give you up");
        store.add("Never gonna let you down");
        store.add("Never gonna run around and desert you");
        store.add("Never gonna make you cry");
        store.add("Never gonna say goodbye");
        store.add("Never gonna tell a lie and hurt you");
        store.add("Never gonna stop");
        

        int n = in.nextInt(); // 공략 갯수
        in.nextLine();

        boolean isChanged = false;
        
        for (int i = 0; i < n; i++) {
            String word = in.nextLine();
            if (!store.contains(word)) {
                isChanged = true; 
                break;
            }
        }
        
        if (isChanged) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
