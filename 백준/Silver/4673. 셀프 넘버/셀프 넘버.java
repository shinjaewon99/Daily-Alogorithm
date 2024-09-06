public class Main {
public static void main(String[] args) {
		boolean[] noneSelfNumber = new boolean[10001];

		for (int i = 1; i <= 10000; i++) {
			int check = result(i);
			//10000이 넘는 숫자는 필요 X
			if(check < 10001){
				noneSelfNumber[check] = true;
			}
		}
    for (int i = 1; i <= 10000; i++) {   
                if (noneSelfNumber[i]==false) {
                    System.out.println(i);
                }
            }
}

public static int result(int number){
	int sum = number;
	while (number !=0){
		sum += (number% 10);
		number = number / 10;
	}
	return sum;
}
}
    	


	
