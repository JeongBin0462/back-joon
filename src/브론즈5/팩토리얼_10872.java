package 브론즈5;

import java.io.*;
public class 팩토리얼_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int result = 1;

        while (true) {
            if (num == 0) {
                bw.write(String.valueOf(result));
                break;
            } else {
                result = result * num;
                num--;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}