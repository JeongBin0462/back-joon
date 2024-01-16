import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String[] strArr = a.split(" ");

        int num1 = Integer.parseInt(strArr[0]);
        int num2 = Integer.parseInt(strArr[1]);

        int count = 0;
        int 나누기 = 1;

        while(true) {
            if (num1 % 나누기 == 0) {
                count ++;
            }

            if (count == num2) {
                break;
            }

            if (num1 < 나누기) {
                나누기 = 0;
                break;
            }

            나누기++;
        }

        System.out.println(나누기);
    }
}