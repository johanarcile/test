package mypackage;

public class ObjectPlus extends Objet {
	char c;
	
	public ObjectPlus(int arg1,String arg2,char arg3) {
		super(arg1,arg2);
		this.c=arg3;
	}
	 
	public String print() {
		return "a="+this.getA()+" and b="+this.getB()+" and c="+this.c;
	}

}
