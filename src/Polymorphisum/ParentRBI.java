package Polymorphisum;
//Method overriding
public  class ParentRBI {
	
	public void HomeLoanInterest() {
		System.out.println("Home loan 6%");
		
	}
	//final method cannot override
	public final void calLateFee(){
		System.out.println(1000);
	}

}
