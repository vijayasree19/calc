package calc;
import java.io.IOException;
import java.util.Scanner;

import calc.Calculate; 

public class CalcUI extends Calculate {

	private static Scanner reader;

	CalcUI(int a, int b, char c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}
	
	void result(int a,int b,char c) throws IOException {
		super.result(a, b, c);
	}
	
	public static void main(String[] args) throws IOException {
        reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int first = reader.nextInt();
        int second = reader.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
        CalcUI c = new CalcUI(first,second,operator);
        c.result(first,second,operator);
        
	}

}
