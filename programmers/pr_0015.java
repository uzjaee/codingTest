package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class pr_0015 {
    public int[] solution(int[] arr, int divisor) {
        int [] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();
        if(answer.length == 0) return new int[]{-1};
        Arrays.sort(answer);
        return answer;
    }
}
