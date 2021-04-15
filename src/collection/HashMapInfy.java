package collection;
//HashMap Assignment......
import java.util.*;

public class HashMapInfy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Integer> InfyMap= new HashMap<String,Integer>();
		InfyMap.put("Pune", 10000);
		InfyMap.put("Benguluru", 500);
		InfyMap.put("Chennai", 15000);
		
		System.out.println(InfyMap);
		System.out.println(InfyMap.get("Pune"));
		
		
	}

}
