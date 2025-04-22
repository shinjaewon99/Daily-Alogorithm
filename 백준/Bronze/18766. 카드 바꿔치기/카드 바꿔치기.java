import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while(t --> 0){
            int length = in.nextInt();
            in.nextLine();

            boolean flag = false;
            
            String[] words1 = in.nextLine().split(" ");
            String[] words2 = in.nextLine().split(" ");
            Arrays.sort(words1);
            Arrays.sort(words2);

            for (int i = 0; i < length; i++) {
                if (!words1[i].equals(words2[i])) {
                    flag = true;
                    break;
                }
            }

            if(flag){
                System.out.println("CHEATER");
            }else{
                System.out.println("NOT CHEATER");
            }
        }
    }
}