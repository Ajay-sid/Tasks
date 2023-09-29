public class Day11_Q3 {
    public static void main(String[] args) {

        Circle circle = new Circle(4.5);
        circle.calCircum();

    }


}
class Circle{

    private double radius;

    Circle(){
        this.radius=0;
    }
    Circle(double radius){
        this.radius=radius;
    }

    public void calCircum(){

        System.out.printf("%.2f",2*Math.PI*radius);



    }



}