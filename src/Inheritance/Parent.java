package Inheritance;

public class Parent extends Grandparent{
	
	String Pname;
	long Pmobile;
	
	public Parent(String Pname ) {
		super("Sambhaji");
		System.out.println("In P Class");
		this.Pname=Pname;
		
	}
	
	public void parentdisplaydata() {
		System.out.println(Pname+ " - " + Pmobile);
		
	}
	
	public void parentsetdata(String Pname,long Pmobile) {
		
		this.Pname=Pname;
		this.Pmobile=Pmobile;
	}
	
	
	

}
