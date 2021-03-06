package Inheritance;

public class Grandparent {
	 String Gname;
	long Gmobile;
	
	public Grandparent(String Gname) {
		System.out.println("In G Class");
		this.Gname="Sambhaji";
		
	}
	
	
	
	public void Grandparentdisplaydata() {
		System.out.println(Gname+ " - " + Gmobile);
		
	}
	
	public void Grandparentsetdata(String Gname, long Gmobile) {
		
		this.Gname=Gname;
		this.Gmobile=Gmobile;
		
	}


}
