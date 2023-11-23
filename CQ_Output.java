
public class CQ_Output {

	public static void main(String[] args) {
		CircularQueue CQ = new CircularQueue();
		
		CQ.enqueue(10);
		CQ.enqueue(20);
		CQ.enqueue(30);
		CQ.enqueue(40);
		
		System.out.println("Size: " + CQ.size());
		System.out.println("Front: " + CQ.front());
		System.out.println("Rear: " + CQ.rear());
		System.out.println("Peek: " + CQ.peek());
		
		CQ.printQueue();
		
		System.out.println();
		System.out.println("=================");
		CQ.enqueue(50);
		CQ.dequeue();
		CQ.enqueue(50);
		
		System.out.println("Size: " + CQ.size());
		System.out.println("Front: " + CQ.front());
		System.out.println("Rear: " + CQ.rear());
		System.out.println("Peek: " + CQ.peek());
		CQ.printQueue();
		
		System.out.println();
		System.out.println("=================");
		CQ.enqueue(70);
		CQ.dequeue();
		CQ.enqueue(80);
		
		System.out.println("Size: " + CQ.size());
		System.out.println("Front: " + CQ.front());
		
		System.out.println("Rear: " + CQ.rear());
		System.out.println("Peek: " + CQ.peek());
		CQ.printQueue();
		
		System.out.println();
		System.out.println("=================");
		System.out.println("Contains 80? " + CQ.contains(80));
		System.out.println("Contains 60? " + CQ.contains(60));
		
		CQ.clear();
		System.out.println();
		System.out.println("=================");
		System.out.println("Is a queue empty? " + CQ.empty());
		System.out.println("Front: " + CQ.front());
		System.out.println("Rear: " + CQ.rear());
		CQ.printQueue();

	}

}
