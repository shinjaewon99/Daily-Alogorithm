import java.util.*;

public class Main {
    private static int recursionCount = 0;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int loop = in.nextInt();
        in.nextLine();
        
        for(int i = 0; i < loop; i++){
            String word = in.nextLine();
            recursionCount = 0;  // 각 문자열 테스트마다 초기화
            int isPalindromeCnt = isPalindrome(word);
            
            System.out.println(isPalindromeCnt + " " + recursionCount);
        }
    }
    
    public static int recursion(String s, int l, int r){
        recursionCount++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}
