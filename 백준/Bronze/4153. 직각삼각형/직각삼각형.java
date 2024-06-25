import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String str = sc.nextLine();

            if (str.equals("0 0 0")) {
                break;
            }

            int[] array = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

            int maxNum = (int) (Math.pow(array[2], 2));
            int ninNum = (int) (Math.pow(array[0], 2) + Math.pow(array[1], 2));

            if (maxNum == ninNum) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}