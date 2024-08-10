package programmers;

import java.util.Arrays;
import java.util.stream.Stream;

public class pr_0011 {
    public boolean solution(int x){
        boolean answer = false;
        // 숫자를 문자배열로
        String []st = String.valueOf(x).split("");
        // 문자배열을 숫자배열로
        int  sum = Arrays.stream(st).mapToInt(Integer::parseInt).sum();
        // 각 합을 더한 수를 x로 나누기
        if(sum%x == 0)
            return answer;
        return answer;

    }
}
