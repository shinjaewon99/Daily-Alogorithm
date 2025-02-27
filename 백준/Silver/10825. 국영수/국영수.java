import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 학생의 수
        in.nextLine();
        
        String[][] st = new String[n][4];

        for(int i = 0; i < n; i++){
            st[i][0] = in.next(); // 학생이름
            st[i][1] = in.next(); // 국어 점수
            st[i][2] = in.next(); // 영어 점수
            st[i][3] = in.next(); // 수학 점수
            
        }

        Arrays.sort(st, (o1, o2) -> {
            int k1 = Integer.parseInt(o1[1]);
            int k2 = Integer.parseInt(o2[1]);
            int e1 = Integer.parseInt(o1[2]);
            int e2 = Integer.parseInt(o2[2]);
            int m1 = Integer.parseInt(o1[3]);
            int m2 = Integer.parseInt(o2[3]);

            if(k1 != k2) return Integer.compare(k2, k1);
            if(e1 != e2) return Integer.compare(e1, e2);
            if(m1 != m2) return Integer.compare(m2, m1);

            return o1[0].compareTo(o2[0]);
        });

        for(int i = 0; i < n; i++){
            System.out.println(st[i][0]);
        }
        
    }
}