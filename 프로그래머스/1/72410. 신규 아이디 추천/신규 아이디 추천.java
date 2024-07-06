import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String new_id) {
         //1단계 : 대문자 -> 소문자 치환
        String step1 = new_id.toLowerCase();

        //2단계 : 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        //특수문자 한정 '-_.~!@#$%^&*()=+[{]}:?,<>/'
        String step2 = step1.replaceAll("[~!@#$%^&*()=+\\[{\\]}:?,<>/]", "");

        //3단계 : 마침표가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        while (step2.contains("..")) {
            String step3 = step2.replace("..", ".");
            step2 = step3;
        }

        //4단계 : 마침표가 처음이나 끝에 위치한다면 제거
        String[] split = step2.split("");
        List<String> list = new ArrayList<>(Arrays.asList(split));

        if (list.get(0).equals(".")) list.remove(0);
        if (!list.isEmpty() && list.get(list.size() - 1).equals(".")) list.remove(list.size() - 1);

        String result;
        StringBuilder sb = new StringBuilder();

        //5단계 : 빈 문자열이라면, new_id에 "a"를 대입
        if (list.isEmpty() || list.get(0).isEmpty()) {
            result = "a";
        } else {
            for (String s : list) {
                sb.append(s);
            }
            result = sb.toString();
        }

        //6단계 : 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거, 제거 후 마침표가 끝에 위치한다면 마침표 제거
        StringBuilder resultSb2 = new StringBuilder();
        if (result.length() > 15) result = result.substring(0, 15);
        String[] resultArr = result.split("");
        List<String> resultList = new ArrayList<>(Arrays.asList(resultArr));
        if (!resultList.isEmpty() && resultList.get(resultList.size() - 1).equals(".")) {
            resultList.remove(resultList.size() - 1);

            for (String s : resultList) {
                resultSb2.append(s);
            }
            result = resultSb2.toString();
        }

        //7단계 : 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        StringBuilder resultSb = new StringBuilder();
        if (result.length() <= 2) {
            String[] splitLowLength = result.split("");
            String s = splitLowLength[splitLowLength.length - 1];
            List<String> stringList = new ArrayList<>(Arrays.asList(splitLowLength));

            while (stringList.size() < 3) {
                stringList.add(s);
            }
            for (String string : stringList) {
                resultSb.append(string);
            }
            result = resultSb.toString();
        }

        return result;
    }
}