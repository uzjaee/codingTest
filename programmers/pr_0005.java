package programmers;

public class pr_0005 {
    public int solution(int n) {
        int answer = 0;
        for(int i =1; i<n;i++){
            if(n%i==1)
                return i;
        }
        return answer;
    }
}
