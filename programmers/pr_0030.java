package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pr_0030 {
    static int transThree(int n){
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        if(n<3) {
            return n;
        }
        else{
            while(n !=1 ){
                list.add(n%3);
                n /=3;
            }
            list.add(1);
            Collections.reverse(list);
            for(int i=0;i<list.size();i++){
                answer += list.get(i)*Math.pow(3,i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 45;
        System.out.println(transThree(n));

    }
}
