package main;

public class Calculator {
	public static int add(int n1,int n2){
		return n1+n2;
	}
	public static int sub(int n1,int n2){
		return n1-n2;
	}
	public static int prod(int n1,int n2){
		return n1*n2;
	}

	public static int div(int n1,int n2){
		return n1/n2;
	}
	public static int mod(int n1,int n2){
		return n1%n2;
	}
	public static int square(int n1){
		return n1*n1;

	}
	public static void main(String[] args) {
		System.out.println("Calculator");
		System.out.println(add(10,20));
	}

}
