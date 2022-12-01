package mypackage;

public class Myclass {
	
	public static void main(String[] args){
		Objet obj = new Objet(5,"yoho");
		obj.multiply(10);
		System.out.println("a="+obj.getA()+" and b="+obj.getB());
		ObjectPlus obj2 = new ObjectPlus(3,"hey",'H');
		obj2.multiply(10);
		System.out.println(obj2.print());
	}

}
