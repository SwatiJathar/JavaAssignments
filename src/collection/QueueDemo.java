package collection;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Swati");
		queue.add("Bujare");
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		
		System.out.println("==========Iterator========");
		for (String QValue : queue) {
			System.out.println(QValue);
		}
		
		
		
	}

}
