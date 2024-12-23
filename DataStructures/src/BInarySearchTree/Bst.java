package BInarySearchTree;

public class Bst {
	
	Node root;
	
	public boolean insert(int value)
	{
		Node newNode=new Node(value);
		if(root==null)
		{
			root=newNode;
			return true;
		}
		else
		{
			Node temp=root;
			while(temp!=null)
			{
				if (newNode.value==temp.value)
						return false;
				if(newNode.value<temp.value)
				{
					if(temp.left==null)
					{
						temp.left=newNode;
						return true;
					}
					temp=temp.left;
				}
				else {
					if(temp.right==null)
					{
						temp.right=newNode;
						return true;
					}
					temp=temp.right;
				}
						
			}
		}
			
			return false;
		}
		
		public boolean contains(int value)
		{

			if(root==null)
			{
				return false;
			}
			else
			{
				Node temp=root;
				while(temp!=null)
				{
					if (value==temp.value)
							return true;
					if(value<temp.value)
					{
						temp=temp.left;
					}
					else {

						temp=temp.right;
					}
							
				}
				
				return false;
			}
		
	}
	
	public static void main(String args[])
	{
		Bst obj=new Bst();
		obj.insert(47);
		obj.insert(21);
		obj.insert(76);
		obj.insert(18);
		obj.insert(52);
		obj.insert(82);
		
		obj.insert(27);
		
		System.out.println(obj.root.left.right.value);
		
		System.out.println(obj.contains(18));
		
	}
	
	

}
