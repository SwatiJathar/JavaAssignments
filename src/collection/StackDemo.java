package collection;
//Use-> If you want to remove last inserted data then use stack
import java.util.*;
import java.util.Iterator;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack=new Stack<String>();
		stack.push("Swara");
		stack.push("Hiranya");
		stack.push("Ranjit");
		stack.push("Jathar");
		
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println("============Iterator1==================");
		for (String sValue : stack) {
			System.out.println(sValue);
		}
		System.out.println("============Iterator2==================");
		Iterator<String> it= stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
	

}
