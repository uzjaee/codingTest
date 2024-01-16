import java.util.Arrays;
import java.util.Scanner;

public class GalaxyActivation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스의 수

        for (int testCase = 1; testCase <= T; testCase++) {
            int n = scanner.nextInt(); // 최정예 요원의 수
            int[][] abilities = new int[n][3]; // 능력치 배열

            // 능력치 입력
            for (int i = 0; i < n; i++) {
                abilities[i][0] = scanner.nextInt(); // 힘
                abilities[i][1] = scanner.nextInt(); // 지능
                abilities[i][2] = scanner.nextInt(); // 민첩
            }

            int result = findMinimumDestroyedAbilities(abilities);
            System.out.println("#" + testCase + " " + result);
        }

        scanner.close();
    }

    private static int findMinimumDestroyedAbilities(int[][] abilities) {
        int n = abilities.length;
        int[][] dp = new int[n + 1][3];

        // 초기값 설정
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }

        dp[0][0] = dp[0][1] = dp[0][2] = 0;

        // dp 배열 채우기
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (j != k) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + abilities[i - 1][j]);
                    }
                }
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            result = Math.min(result, dp[n][i]);
        }

        return (result == Integer.MAX_VALUE) ? -1 : result;
    }
}
