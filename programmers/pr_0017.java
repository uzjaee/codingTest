package programmers;

import java.util.Arrays;

public class pr_0017 {
    public String solution(String phone_number){
        String answer = "";
        String [] li = phone_number.split("");
        for(int i = 0; i<li.length-4; i++){
            li[i] = "*";
        }
        answer =String.join("",li);
        return answer;
    }
}
