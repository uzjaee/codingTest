package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class pr_0024 {
    public String solution(String s){
        String [] li = s.split("");
        Arrays.sort(li, Collections.reverseOrder());
        String answer = String.join("", li);
        return answer;
    }
}
