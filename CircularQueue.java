
public class CircularQueue 
{
	private Object[] queue;
	private int capacity = 4;
	private int front;
	private int rear;
	
	CircularQueue()
	{
		this.queue = new Object [capacity];
		this.front = 0;
		this.rear = 0;
		
	}
	
	public Object enqueue(int e) 
	{	
		if (rear >= capacity) 
		{
			queue[front] = e;
			front = (++front) % capacity;
		}
		else if (queue[front] == null) 
		{
			queue[front] = e;
			front = (++front) % capacity;
		}
		else {
			queue[rear] = e;
			rear = (++rear) % capacity;	
		}
		
		return queue;
	}
	
	public int front() {
		return front;
	}
	
	public int rear() {
		return rear;
	}
	
	public void printQueue() {
		System.out.println("Elements: ");
		for (int i = 0; i < queue.length; i++) {
			System.out.print(queue[i] + " ");
		}
	}

	public Object dequeue() {
		Object t = queue[front];
		queue[front] = null;
		return t;
	}

	public Object peek() {
		return queue[front];		
	}

	public Object size() {
		return queue.length;
	}

	public boolean contains(Object i) {
		boolean e = false;
		for (int j = 0; j < queue.length; j++) 
		{
			if (queue[j] == i) 
			{
				e = true;
			}	
		}
		return e;
	}

	public void clear() {
		for (int i = 0; i < queue.length; i++) {
			queue[i] = null;
		}
		front = rear = 0;
	}

	public Boolean empty() {
		boolean g = false;
		for (int i = 0; i < queue.length; i++) {
			if (queue[i] == null) 
			{
				g = true;
			}
			else 
			{
				g = false;
			}
		}
		return g;
	}	

}
