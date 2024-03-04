package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] M = new int[6];
        int [] W = new int[6];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2;
        int N = Integer.parseInt(st.nextToken());
        double roomMax = Double.parseDouble(st.nextToken());
        for(int i=0;i<N;i++){
            st2 = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st2.nextToken());
            int grade = Integer.parseInt(st2.nextToken());
            if(sex ==0)
                W[grade-1]++;
            else
                M[grade-1]++;
        }
        for(int i =0; i<6;i++){
            if(W[i] == 0)
                continue;
            double c = Math.ceil((double)(W[i])/roomMax);
            count = (int) (count+c);
        }
        for(int i =0; i<6;i++){
            if(M[i] == 0)
                continue;
            double c = Math.ceil((double)(M[i])/roomMax);
            count = (int) (count+c);

        }
        System.out.println(count);

    }
}
