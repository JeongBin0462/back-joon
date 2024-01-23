package Class2_plus_plus;

import java.io.*;

public class 체스판_다시_칠하기_1018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();

        String[] strArr = num.split(" ");

        int num1 = Integer.parseInt(strArr[0]);
        int num2 = Integer.parseInt(strArr[1]);

        String[][] irregularChess = new String[num1][num2];
        int[][] dp = new int[num1][num2];

        for (int i = 0; i < num1; i++) {
            String row = br.readLine();

            irregularChess[i] = row.split("");
        }

        int min = 100;

        for (int i = 0; i + 7 < num1; i++) {
            for (int j = 0; j + 7 < num2; j++) {
                min = Math.min(min, makeChess(i, j, irregularChess, dp));
            }
        }

        bw.write(String.valueOf(min));

        bw.close();
        br.close();
    }

    private static int makeChess(int column, int row, String[][] irregularChess, int[][] dp) {
        if (dp[column][row] > 0) {
            return dp[column][row];
        }

        int case1 = 0;
        int case2 = 0;

        for (int i = column; i < column + 8; i++) {
            for (int j = row; j < row + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (irregularChess[i][j].equals("W")) {
                        case2++;
                    } else {
                        case1++;
                    }
                } else {
                    if (irregularChess[i][j].equals("B")) {
                        case2++;
                    } else {
                        case1++;
                    }
                }
            }
        }
        dp[column][row] = Math.min(case1, case2);
        return dp[column][row];
    }
}