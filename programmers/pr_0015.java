package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class pr_0015 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        List<Integer> li = new ArrayList<>();
        for(int i :arr){
            if(i%divisor == 0)
                li.add(i);
        }
        if(li.size()==0)
            return answer;
        li.sort(Comparator.naturalOrder());
        answer = li.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
