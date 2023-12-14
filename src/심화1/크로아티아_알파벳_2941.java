package 심화1;

import java.util.Scanner;

public class 크로아티아_알파벳_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String b : arr) {
            a = a.replace(b, "!");
        }

        System.out.println(a.length());
    }
}
