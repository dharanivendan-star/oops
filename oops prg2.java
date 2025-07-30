class Name
{
    double pi = 3.14;
    int radius;
    double area;

    void circle(){
         area = pi * radius * radius;
        System.out.println("Area of the circle "+area);

    }
}
public class Main2
{
    public static void main(String[] args) {

        Name dva = new Name();
        dva.radius = 25;
        dva.circle();
    }


}