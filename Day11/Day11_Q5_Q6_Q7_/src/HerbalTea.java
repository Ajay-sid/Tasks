public class HerbalTea extends Tea{
    @Override
    public void prepareTea(){
        System.out.println("With hot watter and Herbs");
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
