package 문자열;

import java.util.Scanner;

public class 다이얼_5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        int sum = 0;

        for (String b : a.split("")) {
            sum += result(b) + 1;
        }
        System.out.println(sum);

        scanner.close();
    }

    private static int result(String a) {
        switch (a) {
            case "A":
            case "B":
            case "C":
                return 2;
            case "D":
            case "E":
            case "F":
                return 3;
            case "G":
            case "H":
            case "I":
                return 4;
            case "J":
            case "K":
            case "L":
                return 5;
            case "M":
            case "N":
            case "O":
                return 6;
            case "P":
            case "Q":
            case "R":
            case "S":
                return 7;
            case "T":
            case "U":
            case "V":
                return 8;
            case "W":
            case "X":
            case "Y":
            case "Z":
                return 9;
            default:
                return 1;
        }
    }
}
