package programmers;

public class pr_0009 {
    static long check(long n,int k){
        long answer = 0;
        for(long i =k; i <n; i++){
            if(i*i ==n)
                return (i+1)*(i+1);
            else
                answer = -1;
        }
        return answer;
    }
    public long solution(long n) {
        long answer =0;
        if( n<100000000)
            answer = check(n,0);
        else if(n>=100000000)
            answer = check(n,10000);
        else if (n>=1000000000000L)
            answer = check(n,1000000);


        return answer;
    }
}

