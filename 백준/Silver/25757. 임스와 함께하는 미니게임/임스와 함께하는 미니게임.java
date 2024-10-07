import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        String word = in.next();
        in.nextLine();

        Set<String> store = new HashSet<>();
        for(int i = 0; i < test; i++){
            store.add(in.nextLine());
        }
        
        if(word.equals("Y")){
            System.out.println(store.size());
        }else if (word.equals("F")){
            System.out.println(store.size()/2);
        }else if(word.equals("O")){
            System.out.println(store.size()/3);
        }
    }
}
