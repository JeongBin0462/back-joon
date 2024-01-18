package 브론즈5;

import java.io.*;

public class 학점계산_2754 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        double score = 0;

        String[] b = a.split("");

        if (!b[0].equals("F")) {
            switch (b[0]) {
                case "A":
                    score = 4;
                    break;
                case "B":
                    score = 3;
                    break;
                case "C":
                    score = 2;
                    break;
                case "D":
                    score = 1;
                    break;
                default:
                    score = 0.0;
                    break;
            }

            switch (b[1]) {
                case "+":
                    score += 0.3;
                    break;
                case "-":
                    score -= 0.3;
                    break;
                default:
                    break;
            }

            bw.write(String.valueOf(score));
        } else {
            bw.write("0.0");
        }

        bw.close();
        br.close();
    }
}
