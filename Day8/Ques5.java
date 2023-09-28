public class Ques5 {
    public static void main(String[] args) {
        int num = 0;

        if(num==1||num==0){
            System.out.println("it is Not a Prime Number");
            }else if(num<0){
                System.out.println("enter only positive numbers");
            }
        
        for(int i =2;i<num;i++){
            
            if(num%i==0){
                System.out.println("It is Not a Prime Number");
                break;
            }else{
                System.out.println("it is a Prime Number");
                break;
            }
        }


//FREDS
    }
    
}
