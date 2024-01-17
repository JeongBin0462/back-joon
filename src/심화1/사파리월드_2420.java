package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사파리월드_2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        String[] strArr = a.split(" ");

        long num1 = Long.parseLong(strArr[0]);
        long num2 = Long.parseLong(strArr[1]);

        long abs = Math.abs((num1 - num2));

        System.out.println(abs);
    }
}
