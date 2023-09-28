public class Ques1{


    public static void main(String[] args) {
        
        String str = "malayalam";
        String rstr = "";
        for(int i=str.length()-1;i>=0;i--){
            rstr = rstr+str.charAt(i);
        }
        if(rstr.equals(str)){
            System.out.println("It is Palindrome");
        }else{
            System.err.println("It is not a Palindrome");
        }



    }
}