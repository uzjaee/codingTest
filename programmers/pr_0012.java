package programmers;

public class pr_0012 {
    public static long sum(int a,int b){
        long answer =0;
        for(int i =a; i<=b; i++)
            answer+=i;
        return answer;
    }
    public long solution(int a, int b) {
        long answer = 0;
        if(a<=b)
            answer = sum(a,b);
        else
            answer = sum(b,a);
        return answer;
    }
}
