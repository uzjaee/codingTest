package programmers;

public class pr_0026 {
    public boolean solution(String s) {
        if(!(s.length() ==4 || s.length() ==6))
            return false;
       for(int i=0; i<s.length(); i++) {
           if(!(s.charAt(i) >=48 && s.charAt(i) <=57))
               return false;
           else
               continue;
       }
       return true;
    }
}
