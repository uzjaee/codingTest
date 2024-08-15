package programmers;

import java.util.Arrays;

public class pr_0018 {
    public int solution(int[] numbers) {
        return 45- Arrays.stream(numbers).sum();
    }
}
