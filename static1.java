package oopslab_java;
class StaticDemo{
	static int a=42;
	static int b=99;
	static void callme(){
		System.out.println("a= "+a);
	   }
}  
public class Static1{
	public static void main(String args[]) {
		StaticDemo.callme();
		System.out.println("b= "+StaticDemo.b);
	}
}
	
