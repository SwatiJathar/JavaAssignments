package Polymorphisum;

public class methodOverloading {
	
	public void sum() {
		System.out.println(10+10);
	}
	
	public void sum(int a) {
		System.out.println(a+10);
	}
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sum(String a) {
		System.out.println(a);
	}
	public void sum(String a,String b) {
		System.out.println(a+ "-" +b);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloading abc=new methodOverloading();
		
		abc.sum(10);
		abc.sum("Swara");
		abc.sum(10, 20);
		abc.sum("Swara", "Ranjit");
		

	}

}
