package 브론즈5;

import java.io.*;

public class N찍기_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int count = 1;

        while (true) {
            bw.write(String.valueOf(count));
            bw.newLine();

            if (count == num) {
                break;
            }
            count++;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}