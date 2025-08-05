package OnlineCourseSystem;

class Box{
    double w,h,d;
    int x, y;
    Box(int a,int b,int c){
        System.out.println("this is constructor");
        w=a;
        h=b;
        d=c;
        System.out.println("the value of a,b,c are "+a+" "+b+" "+c+"");

    }
    Box(int x,int y){
        System.out.println("the sum of x and y is " + (x+y));

    }
}
public class overloadingconstructor{
    public static void main(String[] args) {
        Box dva = new Box(2,4,5);
        Box sd = new Box(5,6);


    }

}





