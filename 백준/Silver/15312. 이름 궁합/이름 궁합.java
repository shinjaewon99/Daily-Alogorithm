import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String a = in.nextLine(); // 종민
        String b = in.nextLine();  // 그녀

        int[] values = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < a.length(); i++){
            result.add(values[a.charAt(i) - 'A']);
            result.add(values[b.charAt(i) - 'A']);
        }

        // 2자리수가 될때까지 반복
        while(result.size() > 2){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < result.size() - 1; i++){
                // 1의 자리만 추출
                temp.add((result.get(i) + result.get(i + 1))% 10);
            }

            result = temp;
        }

        System.out.printf("%d%d", result.get(0), result.get(1));
    }
}
