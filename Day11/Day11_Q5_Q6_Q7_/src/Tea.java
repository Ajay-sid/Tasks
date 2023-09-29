public class Tea{

    public void prepareTea(){

        System.out.println("With Hot water and tea leaves only");
        fromClass();

    }
    public void fromClass(){
        System.out.println("From " + getClass().getName()+ " class");
    }

    public void addMilk(){
        System.out.println("Added milk");

    }
    public void addSugar(){

        System.out.println("Added sugar");

    }

}
