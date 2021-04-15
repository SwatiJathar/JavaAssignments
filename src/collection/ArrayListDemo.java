package collection;
//Use -> Storing different type of data
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Object> arrList = new ArrayList<Object>();
	
	arrList.add("Swara");
	arrList.add(100);
	
	System.out.println(arrList.get(0));
	
	arrList.remove(0);
	System.out.println(arrList.get(0));
	
	
	ArrayList<String> arrstrList= new ArrayList<String>();
	
	arrstrList.add("Swati");
	arrstrList.add("Ranjit");
	arrstrList.add("Jathar");
	arrstrList.add("Hiranya");
	//Retrieve the data from arraylist using different Iterator
	
	System.out.println("============Iterator==================");
	
	int index = 0;
	while(index<=arrstrList.size()-1) {
		
		System.out.println(arrstrList.get(index));
		index++;
	}
	arrstrList.add("Automation");
	System.out.println("============Iterator1==================");
	//arrstrList.remove(0);
	for(String value:arrstrList) {
		System.out.println(value);
	}
	System.out.println("============Iterator2==================");
	Iterator<String> it= arrstrList.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	
	
	
	
	
}
}