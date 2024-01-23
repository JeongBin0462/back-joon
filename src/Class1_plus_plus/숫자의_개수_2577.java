package Class1_plus_plus;

import java.io.*;
import java.util.Arrays;

public class 숫자의_개수_2577 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        long bigNumber = (long) a * b * c;

        String bigNumberStr = String.valueOf(bigNumber);

        String[] splitString = bigNumberStr.split("");

        int[] resultArr= new int[10];
        Arrays.fill(resultArr, 0);

        for (String 각자리 : splitString) {
            int i = Integer.parseInt(각자리);

            resultArr[i] ++;
        }

        for (int result : resultArr) {
            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}