import java.util.*;

public class TriangleKimbapWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            int[] sPos = findPosition(s);
            int[] ePos = findPosition(e);

            int result = bfs(sPos, ePos);
            System.out.println("#" + test_case + " " + result);
        }
        sc.close();
    }

    public static int[] findPosition(int n) {
        int row = (int)((Math.sqrt(8.0*n+1)-1)/2);
        if(n > row*(row+1)/2) row++;
        int col = n - row*(row-1)/2;
        return new int[]{row, col};
    }

    public static int bfs(int[] s, int[] e) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[141][141];
        int[][] dir = {{-1, -1}, {-1, 0}, {0, -1}, {0, 1}, {1, 0}, {1, 1}};
        queue.add(new int[]{s[0], s[1], 0});
        visited[s[0]][s[1]] = true;

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            if(current[0] == e[0] && current[1] == e[1]) return current[2];

            for(int i=0; i<6; i++) {
                int newRow = current[0] + dir[i][0];
                int newCol = current[1] + dir[i][1];
                if(newRow > 0 && newRow <= 140 && newCol > 0 && newCol <= newRow && !visited[newRow][newCol]) {
                    queue.add(new int[]{newRow, newCol, current[2] + 1});
                    visited[newRow][newCol] = true;
                }
            }
        }
        return -1;
    }
}
