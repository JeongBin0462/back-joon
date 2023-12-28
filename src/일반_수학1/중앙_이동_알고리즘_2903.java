package 일반_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 중앙_이동_알고리즘_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine().trim());

        int math = 2;
        int b = 0;

        for (int i = 0; i < a; i++) {
            math = math + (math - 1);
            b = math * math;
        }

        System.out.println(b);
    }
}
