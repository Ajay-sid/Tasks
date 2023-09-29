public class Main {
    public static void main(String[] args) {
        Tea [] arrOfObj = {new Tea(),new BlackTea(),new GreenTea(),new HerbalTea()};
        for(Tea obj :arrOfObj){
            obj.prepareTea();
            obj.addMilk();
            obj.addSugar();
            System.out.println("--------------------------------------");

        }









    }

}