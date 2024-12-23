package hashTables;

import java.util.ArrayList;

public class HashTable {
	
	int size=11;
	public Node[] dataMap;
	
	public HashTable()
	{
		dataMap=new Node[size];
	}

	public void printTable()
	{
		for(int i=0;i<dataMap.length;i++)
		{
			System.out.println("At index " +i);
			Node temp=dataMap[i];
			while(temp!=null)
			{
				System.out.println("key="+temp.key);
				System.out.println("value="+temp.value);
				temp=temp.next;
			}
		}
	}
	
	public int get(String key)
	{
		int index=hash(key);
		Node temp=dataMap[index];
		while(temp!=null)
		{
			if(temp.key==key)
			{
				return temp.value;
			}
			else {
				temp=temp.next;
			}
		}
		return 0;
	}
	
	public ArrayList<String> keys()
	{
		ArrayList<String> keyList=new ArrayList<String>();
		for(int i=0;i<dataMap.length;i++)
		{
			Node temp=dataMap[i];
			while(temp!=null)
			{
				keyList.add(temp.key);
				temp=temp.next;
			}
		}
		return keyList;
	}
	
	public int hash(String key)
	{
		char[] keyArray=key.toCharArray();
		int hash=0;
		
		for(int i=0;i<keyArray.length;i++)
		{
			int val=keyArray[i];
			hash=(hash+val*7)%dataMap.length;
		}
		
		return hash;
	}
	
	public void set(String key, int value)
	{
		int index=hash(key);
		if(dataMap[index]==null)
		{
			dataMap[index]=new Node(key,value);
		}
		else
		{
			Node temp=dataMap[index];
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(key,value);
		}
	}
	
	
	public static void main(String args[])
	{
		HashTable myHashTable=new HashTable();
		myHashTable.set("sunny", 22);
		myHashTable.set("sai", 20);
		System.out.println(myHashTable.keys());
	}
	

}

