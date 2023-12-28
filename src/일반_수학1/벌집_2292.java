package 일반_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine().trim());

        int count = 0;
        int result = 0;

        while (true) {
            a = a - (count * 6);

            count++;
            if (a <= 1) {
                result = count;
                break;
            }
        }
        System.out.println(result);
    }
}