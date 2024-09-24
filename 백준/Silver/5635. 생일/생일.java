import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        in.nextLine();
        String[][] store = new String[number][4];

        for(int i = 0; i < number; i++){
            String word = in.nextLine();
            String[] words = word.split(" ");
            
            store[i][0] = words[0];
            store[i][1] = words[1];
            store[i][2] = words[2];
            store[i][3] = words[3];
        }

        Arrays.sort(store, (String[] o1, String[] o2) -> {
            
            // 생일 연도가 같을 경우
            if(o1[3].equals(o2[3])){
                // 월 같을 경우
                if(o1[2].equals(o2[2])){

                    // 일 이 작을때로 정렬
                    return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
                }
                return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
            }

            return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
        });


        System.out.println(store[number - 1][0] + "\n" + store[0][0]);
       
    }
}
