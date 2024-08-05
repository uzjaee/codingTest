package programmers;

import java.util.ArrayList;

public class pr_0006 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long x2 = x;
        for(int i=0; i<n;i++){
            answer[i] = x;
            x+=x2;
        }
        return answer;
    }
}
