package 심화1;

import java.io.IOException;
import java.util.Scanner;

public class 너의_평점은_25206 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        double sum = 0.0;
        double bigSum = 0.0;

        for (int i = 0; i < 20; i++) {
            String a = scan.nextLine();

            String[] strArr = a.split(" ");

            double double1 = Double.parseDouble(strArr[1]);
            String str2 = strArr[2];

            Double double2 = bb(str2);

            if (double2 == null) {
                continue;
            }

            sum += double1;
            bigSum += (double1 * double2);
        }

        System.out.printf("%.6f%n", Math.round(bigSum / sum * 1000000) / 1000000.0);
    }

    private static Double bb(String a) {
        switch (a) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "P":
                return null;
            case "F":
            default:
                return 0.0;
        }
    }
}