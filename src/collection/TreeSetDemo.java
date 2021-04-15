package collection;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tsvalue = new TreeSet<String>();
		tsvalue.add("Swati");
		tsvalue.add("Bujare");
		tsvalue.add("Jathar 45");
		tsvalue.add("hira 31");
		tsvalue.add("Jathar 45");
		tsvalue.add("Krishnraj 45");
		
		
		System.out.println(tsvalue);
		
		System.out.println("==========Iterator========");
		for (String tvalue : tsvalue) {
			System.out.println(tvalue);
		}
		
	}

}
