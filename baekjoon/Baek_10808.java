package baekjoon;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Baek_10808 {
    public static void main(String[] args) throws IOException {
        //단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] arr = new int[26];
        String s1  ="c";
        String s2 = "a";
        for (String c :br.readLine().split(""))
            arr[c.charAt(0)-'a']++;
        for(int i :arr)
            bw.write(i +" ");
        bw.flush();
        bw.close();
        // 알파벳을 하나하나 확인하는 것보다 그 알파벳의 개수를 표현할 리스트를 만드는 것이 시간복잡도가 빠르다 .
        // 26 X N( 글자수) + 26   > N + 26
    }
}
