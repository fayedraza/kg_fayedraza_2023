 import java.util.*; 
 //Created by Fayed Raza
public class main{
    public static void main (String[]args){
        String s1 = args[0];
        String s2 = args[1];

     boolean result = true;

      if(s1.length() != s2.length()){  //if the length of the strings do not equal to each other then it will return false 
        result = false;
      }else if (s1.length()==0 && s2.length() == 0){ //empty strings will also result to false
           result = false;   
      }else{
        HashSet<Character> occur = new HashSet<Character>();   //Hash Set is used to see if a character has more than 1 of the same character in a set
        for (int x=0; x<s1.length(); x++){
            char c = s1.charAt(x);
            if(occur.contains(c)){
                result = false;
            }else{
                occur.add(c);
            }
        }
         occur.clear();  
       }
        System.out.println(result); //result is printed out
}

}