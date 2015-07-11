package com.test;
import java.util.Iterator;
import java.util.List;
 
public class Customer 
{
	private List lists;

	public List getLists() {
		return lists;
	}

	public void setLists(List lists) {
		this.lists = lists;
	}

	@Override
	public String toString() {
		return "Customer [lists=" + lists + "]";
	}

	public void display()
	{
		
		Iterator its = lists.iterator();
		while(its.hasNext())
		{
			
			System.out.println(its.next());
		}
		
	}
	
}