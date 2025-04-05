import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   
        int ax = in.nextInt();
        int ay = in.nextInt();
        int az = in.nextInt();
        int cx = in.nextInt();
        int cy = in.nextInt();
        int cz = in.nextInt();
        
        System.out.println(cx-az);
        System.out.println(cy/ay);
        System.out.println(cz-ax);
    }
}
