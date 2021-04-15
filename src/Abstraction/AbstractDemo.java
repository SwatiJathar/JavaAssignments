package Abstraction;

public class AbstractDemo extends RBI   {
	
	public void displayname() {
		// TODO Auto-generated method stub
		System.out.println("Under child class implement abstract method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractDemo obj=new AbstractDemo();
		obj.display();
		obj.displayname();
		
		SBI S=new SBI();
		S.roi();
		S.calinterest();
		S.calLateFhee();
		
		Kotak K=new Kotak();
		K.roi();
		K.calinterest();
		
		xyz.defaultMethod();
	}

	

	
	
}
