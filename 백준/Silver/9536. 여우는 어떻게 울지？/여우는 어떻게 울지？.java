import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수
        in.nextLine();

        while (t-- > 0) {
            List<String> store = new ArrayList<>(Arrays.asList(in.nextLine().split(" ")));
            Set<String> compare = new HashSet<>();

            while (true) {
                String word = in.nextLine();
                if (word.equals("what does the fox say?")) break;

                String[] parts = word.split(" ");
                compare.add(parts[2]); // 소리부분
            }

            StringBuilder output = new StringBuilder();
            for (String sound : store) {
                if (!compare.contains(sound)) {
                    output.append(sound).append(" ");
                }
            }

            System.out.println(output.toString().trim());
        }
    }
}
