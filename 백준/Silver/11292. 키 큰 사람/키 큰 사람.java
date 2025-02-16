import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (true) {
            int n = in.nextInt();
            if (n == 0) break;
            in.nextLine();

            List<String> store = new ArrayList<>();
            double max = 0.0;

            for (int i = 0; i < n; i++) {
                String name = in.next();
                double number = in.nextDouble();
                
                if (number > max) {
                    max = number;
                    store.clear();
                    store.add(name);
                } else if (number == max) {
                    store.add(name);
                }
            }

            for (String student : store) {
                System.out.print(student + " ");
            }
            System.out.println();
        }
    }
}
