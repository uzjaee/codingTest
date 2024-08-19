package programmers;

public class pr_0023 {
    public int solution(int left ,int right) {
        int answer = 0;
        // false = 짝수 // true = 홀수
        boolean [] flag = new boolean[right-left+1];
        for(int i =0; i< flag.length;i++) {
            for(int j =1 ; j<=right ; j++){
                if((left+i)%j ==0)
                    flag[i] = !flag[i];
            }

        }
        for(int i=0;i<flag.length;i++) {
            answer += flag[i] ? -1*(left+i) : (left+i);
        }
        return answer;
    }
}
