public class BlackTea extends Tea{
    @Override
    public void prepareTea(){
        System.out.println("With hot watter and Black Coffee powder ");
        super.fromClass();

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
