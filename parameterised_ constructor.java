package OnlineCourseSystem;

class Box{
	double w,h,d;
Box(int a,int b,int c){
	System.out.println("this is constructor");
	w=a;
	h=b;
	d=c;
	System.out.println("the value of a,b,c are "+a+b+c);
	
}
}
public class mass {
	public static void main(String[] args) {
		Box dva = new Box(3,8,5);
		
	}

}
