package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Baek_10804 {
    static Integer [] arr = new Integer[21];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i =1; i< arr.length; i++){
            arr[i] = i;
        }
        for ( int j = 0; j <10; j++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken());
            int i2 = Integer.parseInt(st.nextToken());
            reverse(i1,i2);
        }
        for(int i = 1; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void reverse(int i1, int i2){
        int count = 0;
        if((i2-i1)%2 == 1)
            count = ((i2- i1)/2) +1;
        else
            count = (i2 - i1)/2;
        for(int i = 0; i < count; i++){
            int temp = arr[i1+i];
            arr[i1+i] = arr[i2-i];
            arr[i2-i] = temp;
        }
    }
}
