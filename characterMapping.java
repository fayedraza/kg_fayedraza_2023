public class characterMapping{
    public static void main (String[]args){
        String s1 = args[0];
        String s2 = args[1];
        
        boolean status = true;

        if(s1.length() != s2.length()){
        status = false;
       }else{
        for (int x=0; x<s1.length(); x++){
            if(s1.charAt(x)>s2.charAt(x))
            status = false;
        }
       }
        System.out.println(status);
    }
}