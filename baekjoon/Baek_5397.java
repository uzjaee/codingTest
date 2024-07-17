package baekjoon;

import java.io.*;
import java.util.LinkedList;

public class Baek_5397 {
    public static void main(String[] args) throws IOException{
        // 현재 커서 위치
        // O(N) or O (NlogN)
        // 링크드리스트
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cursor;
        int repeat = Integer.parseInt(br.readLine());
        LinkedList<String> ll ;
        String [] st ;
        for(int i=0; i<repeat;i++){
            cursor =0;
            ll = new LinkedList<>();
            st = br.readLine().split("");
            for(String s :st){
                if(s.equals("<") && cursor !=0){
                    cursor--;
                }
                else if (s.equals(">") && cursor !=ll.size()){
                    cursor++;
                }
                else if(s.equals("-") && cursor!=0){
                    ll.remove(cursor-1);
                    cursor--;
                }
                else if(!(s.equals("<")) && !(s.equals(">"))){
                    ll.add(cursor,s);
                    cursor++;
                }
            }
            for(String s:ll){
                bw.write(s);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
