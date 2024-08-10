package programmers;

import java.util.Arrays;
import java.util.Collections;


public class pr_0010 {
    public long solution(long n) {
        long answer = 0;
        // long > array(string)
        String [] digit = Long.toString(n).split("");
        // array.sort
        Arrays.sort(digit, Collections.reverseOrder());
        // array> String
        answer = Long.parseLong(String.join("", digit));

        return answer;
    }
}
