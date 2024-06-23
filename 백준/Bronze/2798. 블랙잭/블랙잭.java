import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력값
        String condition1 = sc.nextLine();
        String condition2 = sc.nextLine();

        String[] splitCondition1 = condition1.split(" ");
        String[] splitCondition2 = condition2.split(" ");

        // 카드 뭉치 int 배열로 변환
        int[] cards = Arrays.stream(splitCondition2).map(String::trim).mapToInt(Integer::parseInt).toArray();

        // solution을 위한 재귀함수 호출
        int result = findBlackjackBestSum(cards, Integer.parseInt(splitCondition1[0]), Integer.parseInt(splitCondition1[1]), 3, 0, 0, 0);

        // 출력
        System.out.println(result);
    }

    private static int findBlackjackBestSum(int[] cards, int cardLength, int targetSum, int choiceNum, int startIndex, int currentSum, int count) {
        if (count == choiceNum) {
            // K개의 카드를 선택한 경우, 합이 M을 넘지 않으면 합을 반환
            return currentSum <= targetSum ? currentSum : 0;
        }

        int bestSum = 0;

        for (int i = startIndex; i < cardLength; i++) {
            int newSum = currentSum + cards[i];
            if (newSum <= targetSum) {
                // 현재 카드를 포함하여 재귀 호출
                bestSum = Math.max(bestSum, findBlackjackBestSum(cards, cardLength, targetSum, choiceNum, i + 1, newSum, count + 1));
            }
        }

        return bestSum;
    }
}