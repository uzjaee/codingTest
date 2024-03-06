package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baek_11328 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            bw.write(strfry(st.nextToken(),st.nextToken()));
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }
    static String strfry(String s1, String s2){
        int [] arr = new int[26];
        char [] st1 = s1.toCharArray();
        char [] st2 = s2.toCharArray();

        for(char c:st1)
            arr[c-'a']++;
        for(char c:st2)
            arr[c-'a']--;
        for(int i :arr)
            if(i!=0)
                return "Impossible";
        return "possible";
    }
}
