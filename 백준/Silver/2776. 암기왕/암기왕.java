import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for(int i = 0; i < t; i++){
            Set<Integer> store = new HashSet<>();
            int m = in.nextInt(); // 수첩 1

            for(int j = 0; j < m; j++){
                store.add(in.nextInt());
            }

            int n = in.nextInt(); // 수첩 2
            StringBuilder output = new StringBuilder();

            for(int j = 0; j < n; j++){
                if(store.contains(in.nextInt())){
                    output.append("1").append("\n");
                }else{
                    output.append("0").append("\n");
                }
            }

            System.out.print(output.toString());
        }
    }
}