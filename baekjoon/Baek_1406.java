package baekjoon;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baek_1406 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<String> sentence = new LinkedList<>(Arrays.asList(br.readLine().split("")));
        int cursor =sentence.size() ,max_cursor = sentence.size(), repeat =Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0;i<repeat;i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("L") && cursor !=0){
                cursor--;
            }
            else if(command.equals("D") && cursor !=max_cursor){
                cursor++;
            }
            else if(command.equals("B") && cursor!=0){
                sentence.remove(cursor-1);
                cursor--;
            }
            else if(command.equals("P")){
                sentence.add(cursor,st.nextToken());
                cursor++;
            }
        }
        for(String s :sentence){
            bw.write(s);
        }
        bw.flush();



    }


}
