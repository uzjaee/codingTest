package programmers;

public class pr_0021 {
    public String solution(int n) {
        String s = "수박";
        String answer = "";
        for(int i =0;i<n/2+n%2;i++)
            answer +=s;
        if(n%2 ==1)
            answer = answer.substring(0,answer.length()-1);
        return answer;
    }
}
