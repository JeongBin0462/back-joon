import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {        
        long count = Arrays.stream(array)
                           .filter(qq -> qq == n)
                           .count();
        
        return (int) count;
    }
}