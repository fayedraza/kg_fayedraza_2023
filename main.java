public class main{
    public static void main (String[]args){
        String s1 = args[0];
        String s2 = args[1];

        
        
        boolean status = true;

        if(s1.length() != s2.length()){
        status = false;
       }else{
        for (int x=0; x<s1.length(); x++){
            char c = s1.charAt(x);
            int occurance = numOfOccurances(c,s1);
            if(occurance > 1)
            status = false;
        }
       }
        System.out.println(status);
    }

    private static int numOfOccurances(char c, String s){
        int count = 0;
        for(int x=0; x<s.length(); x++){
            char a = s.charAt(x);
            if(a==c)
            count++;
        }
        return count;
    }
}