package LinkedLists;
import java.util.Scanner;

public class LinkedList
{
	Node head;
	Node tail;
	
	public LinkedList()
	{
		this.head=head;
		this.tail=tail;
	}
	
	public static void main (String args[])
		{
			LinkedList l1=new LinkedList();
			Scanner sc=new Scanner(System.in);
			System.out.println("No of values");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				l1.InsertAtEnd(sc.nextInt());
			}
			l1.printLL();
			//System.out.println("Node at 4"+" "+l1.get(4).value);
			l1.InsertAft(545, 1);
			System.out.println(l1.len());
			l1.printLL();
			
		}
	private void printLL() {
		if(head==null)
		{
			System.out.println("Linked list is empty");
		}
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.println(temp.value);
				temp=temp.next;
			}
		}
	}
	public int len()
	{
		Node temp=head;
		int len=0;
		while (temp!=null)
		{
			temp=temp.next;
			len++;
		}
		return len;
	}
	public Node get(int idx)
	{
		int leng=len();
		if (idx<0 || idx>leng)
		{
			return null;
		}
		Node temp=head;
		int c=0;
		while(c<idx)
		{
			temp=temp.next;
			c++;
		}
		
		return temp;
	}
	public void InsertAtBeg(int value)
	{
		if(head==null && tail==null)
		{
			Node newNode=new Node(value);
			head=newNode;
			tail=newNode;
		}
		else
		{
			Node temp=new Node(value);
			temp.next=head;
			head=temp;
		}
	}
	public void InsertAtEnd(int value)
	{
		if(head==null && tail==null)
		{
			Node newNode=new Node(value);
			head=newNode;
			tail=newNode;
		}
		else
		{
			Node newNode=new Node(value);
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public void InsertAft(int value, int idx)
	{
		int leng=len();
		if(idx>leng)
		{
			System.out.println("idx is out of range");
		}
		else if(idx==0)
		{
			InsertAtBeg(value);
		}
		else if(idx==leng)
		{
			InsertAtEnd(value);
		}
		else
		{
			Node temp=head;
			int c=0;
			Node pre=head;
			while(c<idx-1)
			{
				pre=temp;
				temp=temp.next;
				c++;
			}
			Node newNode=new Node(value);
			newNode.next=temp;
			pre.next=newNode;
		}
	}
	public void removeEnd()
	{
		if(head==null&& tail==null)
		{
			System.out.println("Linked List is empty");
		}
		else if(head==tail)
		{
			Node temp=head;
			head=null;
			tail=null;
		}
		else
		{
			Node temp=head;
			Node pre=head;
			while(temp.next!=null)
			{
				pre=temp;
				temp=temp.next;
			}
			tail=pre;
			tail.next=null;	
		}
	}
	
	private void removeAtBeg() {
		if(head==null && tail==null)
		{
			System.out.println("Linked List is Empty");
		}
		else if(head==tail)
		{
			Node temp=head;
			head=null;
			tail=null;
		}
		else
		{
			head=head.next;
		}
		
	}

}