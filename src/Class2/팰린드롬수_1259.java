package Class2;

import java.io.*;

public class 팰린드롬수_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String readLine = br.readLine();
            if (readLine.equals("0")) {
                break;
            }

            bw.write(isPalindrome(readLine) ? "yes" : "no");
            bw.newLine();
        }

        bw.close();
        br.close();
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
