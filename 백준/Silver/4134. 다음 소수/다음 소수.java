import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test_case = Integer.parseInt(br.readLine());
        for(int i=0; i<test_case; i++)
        {
            long number = Long.parseLong(br.readLine());
            
            if(number == 0 || number == 1 || number == 2)
            {
                System.out.println(2);
                continue;
            }

            while(true)
            {
                int result = 0;
                for(long j=2; j<=Math.sqrt((double)number); j++)
                {
                    if(number % j == 0)
                    {
                        result++;
                        break;
                    }
                }

                if(result == 0)
                {
                    System.out.println(number);
                    break;
                }

                number++;
            }

        }
    }
}