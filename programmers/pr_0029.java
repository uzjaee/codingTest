package programmers;

public class pr_0029 {
    public int[] solution(int n, int m) {
        //todo : 유클리드 호제법 혹은 스스로 재귀함수를 만들어서 구해볼것!

        int[] answer = new int[]{1,1};
        while(true) {
            if(m%n!=0 || n==1) {
                answer[1] = answer[0] * n * m;
                break;
            }
            for (int i = 2; i <= n; i++) {
                if (n % i == 0 && m % i == 0) {
                    answer[0] *= i;
                    n /= i;
                    m /= i;
                    break;   // n 이 1 부터 시작해야하는 경우가 있음 .그러므로 빠져나와서 다시 검증
                }
            }

        }
        return answer;
    }
}
