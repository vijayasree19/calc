package calc;

import java.io.FileWriter;
import java.io.IOException;

import calc.Variables;

class Store extends Variables{
	char op;
	int res;
	private FileWriter fw;

	Store(int numOne, int numTwo,char c) {
		super(numOne, numTwo);
		this.op = c;
	}
	 void setResult(int res) throws IOException
	 {
		 this.res = res;
		 fw = new FileWriter("hist.txt");
		 fw.append(op);
		 fw.append((char)super.numOne);
		 fw.append((char)super.numTwo);
		 fw.append("and result is");
		 fw.append((char)res);
		 
	 }
	
	

	
	

}
