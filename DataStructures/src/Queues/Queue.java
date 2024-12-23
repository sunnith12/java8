package Queues;

public class Queue {
	
	Node first;
	Node last;
	public static int length=0;
	
	public void enqueue(int value)
	{
		Node newNode=new Node(value);
		if(first==null&& last==null)
		{
			first=newNode;
			last=newNode;
			length++;
		}
		else {
			last.next=newNode;
			last=newNode;
			length++;
		}
	}
	
	public Node dequeue()
	{
		if(first==null&& last==null)
		{
			System.out.println("empty Queue");
			return null;
		}
		else if(length==1)
		{
			Node temp=first;
			first=null;
			last=null;
			return temp; 
		}
		else {
			Node temp=first;
			first=first.next;
			temp.next=null;
			length--;
			return temp;
		}
		
	}
	
	public void printQueue()
	{
		if(first==null&& last==null)
		{
			System.out.println("Empty Queue");
		}
		else {
			Node temp=first;
			while(temp!=null)
			{
				System.out.println(temp.value);
				temp=temp.next;
			}
		}
		
	}

	public static void main(String[] args) {
		
		Queue obj=new Queue();
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.enqueue(4);

		obj.printQueue();
		
		System.out.println("dequeued "+obj.dequeue().value);
		System.out.println("dequeued "+obj.dequeue().value);
		System.out.println("dequeued "+obj.dequeue().value);
		System.out.println("dequeued "+obj.dequeue().value);
		obj.dequeue();
		
		obj.printQueue();
		
	}

}
