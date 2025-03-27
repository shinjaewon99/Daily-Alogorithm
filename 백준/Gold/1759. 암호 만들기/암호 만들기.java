import java.util.*;

class Main {
    private static int l;
    private static int c;
    private static char[] ch;
    private static List<String> store = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        l = in.nextInt();
        c = in.nextInt();
        in.nextLine();

        ch = new char[c];
        
        String[] words = in.nextLine().split(" ");

        for(int i = 0; i < c; i++){
            ch[i] = words[i].charAt(0);
        }

        Arrays.sort(ch);

        back(0, "", 0, 0);

        for(String result : store){
            System.out.println(result);
        }
        
    }

    private static void back(int depth, String password, int cnt1, int cnt2){
        
        // 비밀번호의 길이가 같은지 확인
        if(password.length() == l){
            // 최소 모음 한개, 자음 두개인지 확인
            if(cnt1 >= 1 && cnt2 >= 2){
                store.add(password);
            }
            return;
        }

        for(int i = depth; i < c; i++){
            char compare = ch[i];
            
            if(isCheck(compare)){
                back(i + 1, password + compare, cnt1 + 1, cnt2);
            }else{
                back(i + 1, password + compare, cnt1, cnt2 + 1);
            }
        }
    }

    // 모음인지 체크
    private static boolean isCheck(char c){
        return "aeiou".indexOf(c) >= 0;
    }
}