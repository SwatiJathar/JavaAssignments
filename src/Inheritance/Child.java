package Inheritance;

public class Child extends Parent{
	String Cname;
	long Cmobile;
	
	public Child(String Cname) {
		super("Dhodiram");
		System.out.println("In Child Class");
		this.Cname=Cname;
		
	}
	
	
	public void Childdisplaydata() {
		System.out.println(Cname+ " - " + Cmobile);
		
	}
	
	public void Childsetdata(String Cname, long Cmobile) {
		this.Cname=Cname;
		this.Cmobile=Cmobile;
		
	}

}
