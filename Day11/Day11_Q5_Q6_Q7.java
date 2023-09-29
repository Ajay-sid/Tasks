public class Day11_Q5_Q6_Q7 {

    public static void main(String[] args) {

    }
}

class Tea{

    public void prepareTea(){

        System.out.println("With Hot water and tea leaves only");
        System.out.println("From" + getClass().getName()+ "class");

    }

    public void addMilk(){
        System.out.println("Added milk");

    }
    public void addSugar(){

        System.out.println("Added sugar");

    }

}

class BlackTea extends Tea{
   @Override
    public void prepareTea(){
       System.out.println("With hot watter and Black Coffee powder ");
       System.out.println("From" + getClass().getName()+ "class");

    }

    @Override
    public void addMilk() {
        super.addMilk();
    }

    @Override
    public void addSugar() {
        super.addSugar();
    }
}