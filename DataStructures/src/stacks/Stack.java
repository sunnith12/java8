package stacks;

public class Stack {
	
	Node top;
	int height=0;
	
	public Stack(int value)
	{
		Node newNode=new Node(value);
		top=newNode;
		height=1;
	}
	
	public void getTop()
	{
		if(top!=null)
		{
			System.out.println(top.value);
		}
	}
	
	public void getHeight()
	{
		System.out.println("stack height "+ height);
	}
	
	public void printStack()
	{
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
	}
	
	public void push(int value) {
		Node newNode=new Node(value);
		if(top==null)
		{
			top=newNode;
		}
		else {
		newNode.next=top;
		top=newNode;
		}
		height++;
	}
	
	public Node pop()
	{
		if(top==null)
		{
			System.out.println("Stack is empty");
			return null;
		}
		else {
		Node temp=top;
		top=top.next;
		temp.next=null;
		height--;
		return temp;
		}
	}
	
	public static void main(String args[])
	{
		Stack obj=new Stack(4);
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.printStack();
		System.out.println(obj.pop().value);
		obj.printStack();
		obj.getHeight();
		
	}

}
