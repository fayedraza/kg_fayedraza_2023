 import java.util.*; 
public class main{
    public static void main (String[]args){
        String s1 = args[0];
        String s2 = args[1];

     boolean status = true;

      if(s1.length() != s2.length()){
        status = false;
      }else if (s1.length()==0 && s2.length() == 0){
           status = false;   
      }else{
        HashSet<Character> occur = new HashSet<Character>();   
        for (int x=0; x<s1.length(); x++){
            char c = s1.charAt(x);
            if(occur.contains(c)){
                status = false;
            }else{
                occur.add(c);
            }
        }
         occur.clear();
       }
        System.out.println(status);
}

}