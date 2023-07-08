import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str1 = in.nextLine();
        String str2 = in.nextLine();

        String[] time = str1.split(":");
        String[] compare = str2.split(":");

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(compare[i]) - Integer.parseInt(time[i]);
        }


        if (str1.equals(str2)) {
            System.out.println("24:00:00");
        } else {

            // 초가 음수인 경우
            if (arr[2] < 0) {
                arr[2] += 60;
                arr[1]--;
            }
         
            // 분이 음수인 경우
            if (arr[1] < 0) {
                arr[1] += 60;
                arr[0]--;
            }
            
            // 시간이 음수인 경우
            if (arr[0] < 0) {
                arr[0] += 24;

            }
          
            System.out.printf("%02d:%02d:%02d", arr[0], arr[1], arr[2]);
        }

    }
}
