package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class MultipleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, ArrayList<String>> map1= new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> OnlineBatch3= new ArrayList<String>();
		OnlineBatch3.add("Swati");
		OnlineBatch3.add("Sapana");
		OnlineBatch3.add("Vaishali");
		
		map1.put("OnlineBatchThree", OnlineBatch3);
		//System.out.println(map1);
		
		ArrayList<String> OnlineBatch2= new ArrayList<String>();
		OnlineBatch2.add("Radha");
		OnlineBatch2.add("Krishna");
		OnlineBatch2.add("RJ");
		
		map1.put("OnlineBatchTwo", OnlineBatch2);
		System.out.println(map1);
		
		System.out.println(map1.get("OnlineBatchTwo").get(0));
		
	}

}
