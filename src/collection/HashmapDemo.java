package collection;
import java.util.*;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		map.put("OnlineBatch3", 5);
		map.put("Swati", 100);
		map.put("RJ", 8082);
		map.put("RJ", 200);
		
		System.out.println(map);
		System.out.println(map.get("RJ"));
		
		
		
	}

}
