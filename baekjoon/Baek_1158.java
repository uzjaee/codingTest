package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baek_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력리스트 0을 포함한 것 (0은 쓰이지 않음)
        //출력되는 리스트
        // 맨 끝 조심
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l_size = Integer.parseInt(st.nextToken());
        List <Integer> li = new ArrayList<>(l_size);
        int [] result = new int[l_size];
        int cursor = 1;
        int k = Integer.parseInt(st.nextToken())-1;
        for(int i=0; i<=l_size;i++)
            li.add(i);
        bw.write("<");
        for(int i=0; i<l_size;i++){
            cursor+=k;
            if(cursor>li.size()){
                if((cursor%=(li.size()-1))==0){
                    cursor+=(li.size()-1);
                    bw.write(li.remove(cursor)+"");
                }
                else
                    bw.write(li.remove(cursor)+"");
            }
            else{
                bw.write(li.remove(cursor)+"");
            }
            if(li.size()!=1){
                bw.write(", ");
            }
        }
        bw.write(">");
        bw.flush();
        bw.close();

    }
}
