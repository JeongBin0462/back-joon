import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.solution(1, 2, 1, 2);
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int 분모 = denom1;
        int 분자 = numer1;

        if (denom1 != denom2) {
            분모 = denom1 * denom2;
            분자 = (numer1 * denom2) + (numer2 * denom1);
        }

        System.out.println("분모 = " + 분모);
        System.out.println("분자 = " + 분자);

        List<Integer> 분모의약수 = new ArrayList<>();
        List<Integer> 분자의약수 = new ArrayList<>();

        for (int i = 2; i <= 분모; i++) {

            if (분모 % i == 0) {
                분모의약수.add(i);
            }
        }

        for (int i = 2; i <= 분자; i++) {
            if (분자 % i == 0) {
                분자의약수.add(i);
            }
        }

        분모의약수.retainAll(분자의약수);

        int max = Integer.MIN_VALUE;

        for (int i : 분모의약수) {
            max = Math.max(max, i);
        }

        System.out.println("max = " + max);

        if (max > 1) {
            분모 = 분모 / max;
            분자 = 분자 / max;
        }

        System.out.println("최종분자 = " + 분자);
        System.out.println("최종분모 = " + 분모);

        int[] answer = {분자, 분모};

        return answer;
    }
}