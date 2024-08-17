package programmers;

import java.util.Arrays;

public class pr_0020 {
    public String solution(String s) {
        String answer = "";
        int center = (s.length()/2)-1;
        if(s.length()%2 == 0)
            answer = String.valueOf(s.charAt(center))+String.valueOf(s.charAt(center + 1));
        else
            answer = String.valueOf(s.charAt(center + 1));
        return answer;
    }

}
