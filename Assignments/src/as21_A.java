
public class as21_A {

	public String str="JAVA";
	public double val;
	
	public void print() {
		System.out.println("str: "+str+" ,val: "+val);
	}
	
	public as21_A() {
		
	}
	
	public as21_A(String anything) {
		this.str=anything;
	}
	
	public as21_A(String anything,double number) {
		this.str=anything;
		this.val=number;
	}
	
	public as21_A(double number) {
		this.val=number;
	}
	
}
