package 일반_수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세탁소_사장_동혁_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < a; i++) {
            int amount = Integer.parseInt(br.readLine().trim());
            result(amount);
        }
    }

    private static void result(int amount) {
        int quarters = amount / 25;
        int remainderAfterQuarters = amount % 25;

        int dimes = remainderAfterQuarters / 10;
        int remainderAfterDimes = remainderAfterQuarters % 10;

        int nickels = remainderAfterDimes / 5;
        int pennies = remainderAfterDimes % 5;

        StringBuilder sb = new StringBuilder();
        sb.append(quarters).append(" ").append(dimes).append(" ")
                .append(nickels).append(" ").append(pennies);

        System.out.println(sb);
    }
}
