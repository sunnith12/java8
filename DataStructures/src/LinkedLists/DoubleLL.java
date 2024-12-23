package LinkedLists;
public class DoubleLL {
	
	NodeDLL head;
	NodeDLL tail;
	
	public DoubleLL()
	{
		this.head=head;
		this.tail=tail;
	}
	
	public static void main(String args[])
	{
		DoubleLL obj=new DoubleLL();
		obj.prepand(12);
		obj.prepand(122);
		obj.append(13);
		obj.prinDll();
	}
	
	public void prepand(int value)
	{
		NodeDLL newNode=new NodeDLL(value);
		newNode.next=head;
		newNode.prev=null;
		head=newNode;
	}
	
	public void append(int value)
	{
	
		
		
	}
	
	public void prinDll()
	{
		System.out.println("hi");
		NodeDLL temp=head;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp=temp.next;
		}
	}

}
