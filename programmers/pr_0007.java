package programmers;

import java.util.ArrayList;

public class pr_0007 {
        public int[] solution(long n) {
            ArrayList<Integer> arrli = new ArrayList<>();
            while(n !=0){
                arrli.add(Long.valueOf(n%10).intValue());
                n/=10;
            }
            int[] answer = arrli.stream().mapToInt(Integer::intValue).toArray();;

            return answer;
        }
    }
