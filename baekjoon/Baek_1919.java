package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[26];
        int result = 0;

        char [] s1 = br.readLine().toCharArray();
        char [] s2 = br.readLine().toCharArray();
        for(char c : s1)
            arr[c-'a']++;
        for(char c: s2)
            arr[c-'a']--;
        for(int i=0;i<arr.length;i++) {
            result += Math.abs(arr[i]);
        }
        System.out.println(result);

    }
}
