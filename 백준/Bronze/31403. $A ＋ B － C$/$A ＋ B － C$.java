import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String a = in.nextLine();
        String b = in.nextLine();
        String c = in.nextLine();
        
        System.out.println(Integer.valueOf(a) + Integer.valueOf(b) - Integer.valueOf(c));
        System.out.println(Integer.parseInt(a + b) - Integer.parseInt(c));
    }
}