package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class pr_0008 {
    public int solution(String s) {
        int answer = 0;
        int plag = 1;
        ArrayList<String> li = new ArrayList<>(Arrays.asList(s.split("")));
        if(li.get(0).equals("-")){
            li.remove(0);
            plag = 0;
        }
        else if(li.get(0).equals("+")){
            li.remove(0);
        }
        String k = String.join("",li);
        answer = Integer.parseInt(String.join("",li));
        answer = (plag==1)? answer: -1*(answer);

        return answer;
    }
}
