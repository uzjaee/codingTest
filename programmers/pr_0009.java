package programmers;

public class pr_0009 {
        public long solution(long n) {
            long answer = -1;
            if(Math.pow((int)Math.sqrt(n),2) == n)
                return (long)Math.pow((Math.sqrt(n)+1),2);
            return answer;
        }
    }


