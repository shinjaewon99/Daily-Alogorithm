import java.util.*;
    
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int cyDefault = 100;
        int sdDefault = 100;

        for(int i = 0; i < n; i++){
            int cy = in.nextInt(); // 창영
            int sd = in.nextInt(); // 상덕

            if(cy > sd){
                sdDefault -= cy;
            }else if(cy < sd){
                cyDefault -=sd; 
            }
        }

        System.out.println(cyDefault);
        System.out.println(sdDefault);
    }
}
