import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        in.nextLine();
        
        String[][] store = new String[number][2];

        for(int i = 0; i < number; i++){
            store[i][0] = in.next();
            store[i][1] = in.next();
        }

        Arrays.sort(store, (String[] o1, String[] o2) -> {
            int age1 = Integer.parseInt(o1[0]);  // o1의 나이
            int age2 = Integer.parseInt(o2[0]);  // o2의 나이

            return age1 - age2;
        });

        for(int i = 0; i < number; i++) {
            System.out.println(store[i][0] + " " + store[i][1]);
        }
    }
}
