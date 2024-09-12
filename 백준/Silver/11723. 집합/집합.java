import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        in.nextLine(); // 개행 제거

        Set<Integer> store = new HashSet<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String[] words = in.nextLine().split(" ");
            String command = words[0];
            
            switch (command) {
                case "add":
                    int numToAdd = Integer.parseInt(words[1]);
                    store.add(numToAdd);
                    break;
                    
                case "remove":
                    int numToRemove = Integer.parseInt(words[1]);
                    store.remove(numToRemove);
                    break;
                    
                case "check":
                    int numToCheck = Integer.parseInt(words[1]);
                    if (store.contains(numToCheck)) {
                        output.append("1\n");
                    } else {
                        output.append("0\n");
                    }
                    break;
                    
                case "toggle":
                    int numToToggle = Integer.parseInt(words[1]);
                    if (store.contains(numToToggle)) {
                        store.remove(numToToggle);
                    } else {
                        store.add(numToToggle);
                    }
                    break;
                    
                case "all":
                    store.clear();
                    for (int j = 1; j <= 20; j++) {
                        store.add(j);
                    }
                    break;
                    
                case "empty":
                    store.clear();
                    break;
                    
                default:
                    break;
            }
        }

        System.out.print(output.toString());
    }
}
