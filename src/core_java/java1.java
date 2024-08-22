package core_java;

import java.util.Scanner;

public class java1 {
    
	double p,t,r;
	double si,ci;
	Scanner sc;
	void input() {
		sc = new Scanner(System.in);
		System.out.println("Enter principal amount: ");
		p=sc.nextDouble();
		System.out.println("Enter rate of interst: ");
		r=sc.nextDouble();
		System.out.println("Enter time: ");
		t=sc.nextDouble();
		
	}
	void compute(){
	    si=p*t*r/100;
	    ci=p*Math.pow(1+(r/100), t);
	}
	void display() {
		System.out.println("Simple Interest: "+si);
		System.out.println("Compound interest: "+ci);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         java1 j = new java1();
         j.input();
         j.compute();
         j.display();
	}

}
