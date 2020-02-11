package calc;

import java.io.IOException;

import calc.Store;

class Calculate extends Store {
	char operation;
	int result;
	
	Calculate(int a,int b,char c)
	{
		super(a,b,c);
		operation = c;
	}
	
	void result(int a, int b,char c) throws IOException {
        int result;
        switch(c)
        {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.printf("Error! No operator found with this symbol");
                return;
        }
        this.result = result;
        super.setResult(result);
        System.out.printf("Results are %.1d %c %.1d = %.1d", a, c, b, result);
    }
		
}
	
	
	


