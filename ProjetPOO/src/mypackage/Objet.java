package mypackage;

public class Objet {
	
	private int a;
	private String b;
	
	public Objet(int arg1,String arg2) {
		a=arg1;
		b=arg2;
	}
	
	public int getA() {
		return a;
	}
	
	public String getB() {
		return b;
	}
	
	public void multiply(int m) {
		this.a = this.a * m;
	}
	
}


