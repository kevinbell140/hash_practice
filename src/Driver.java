/**
 * 
 */

/**
 * @author kebell
 *
 */

import java.util.*;

public class Driver {
	
	
	private ArrayList<President> presidents;
	private int counter = 1;
	HashTable table1;
	HashTable table2;
	
	
	public Driver(ArrayList<President> p)
	{
		presidents = p;
		table1 = createTable(37);
		table2 = createTable(23);
	}
	
	private void getHeader()
	{
	
		System.out.println("Hash Table " + counter++);
		System.out.println("----------------");
	}
	
	private HashTable createTable(int size)
	{
		HashTable table = new LinearSimpleHashTable(size);
		
		for (President p : presidents)
		{
			table.insert(p);
		}
		getHeader();
		table.display();
		return table;
		
	}
}
