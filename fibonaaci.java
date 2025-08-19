package oopslab_java;
import java.util.Scanner;
public class Fibonacci {
	public static int fibo(int n) { //static method ,it can be accessed before object creation 
		if(n<=0) {
			return 0;
		}
		else if (n==1) {
				return 1;
			}
		else {
			return fibo(n-1) + fibo(n-2);
		}
		
	}


public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number of terms(n) : ");
	int n= scanner.nextInt();
	System.out.println("Fibonacci series");
	for(int i=0;i<n;i++) {
		System.out.print(fibo(i)+ " ");
	}
	scanner.close();
	
	
	
	
}
	
}

