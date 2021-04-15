package collection;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> lhsValue = new LinkedHashSet<String>();
		lhsValue.add("Swati");
		lhsValue.add("Bujare");
		lhsValue.add("SwaRa 45");
		lhsValue.add("Swati");
		
		System.out.println(lhsValue);
	
		System.out.println("==========Iterator========");
		for (String LSValue : lhsValue) {
			System.out.println(LSValue);
		}
	
	}

}
