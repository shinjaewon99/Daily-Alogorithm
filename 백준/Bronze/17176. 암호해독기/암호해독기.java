import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 문자열의 길이
        in.nextLine();
        List<Integer> store = new ArrayList<>();
        List<Integer> compare = new ArrayList<>();

        // 암호문 읽기
        String[] words = in.nextLine().split(" ");
        for(int i = 0; i < n; i++){
            store.add(Integer.valueOf(words[i]));
        }

        // 평문 읽기
        String text = in.nextLine();

        for(char ch : text.toCharArray()){
            if(ch == ' '){
                compare.add(0); // 공백은 0
            }else if(ch >= 'A' && ch <= 'Z'){
                compare.add(ch - 'A' + 1);
            }else if(ch >= 'a' && ch <= 'z'){
                compare.add(ch - 'a' + 27);
            }
        }

        Collections.sort(store);
        Collections.sort(compare);

        if(store.equals(compare)){
            System.out.println("y");
        }else{
            System.out.println("n");
        }
    }
}