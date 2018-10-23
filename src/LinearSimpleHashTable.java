import java.util.*;

public class LinearSimpleHashTable extends HashTable{

	public LinearSimpleHashTable(int size) 
	{ 
		super(size);
		
	}

	@Override
	public void display() {
		for (int i =0; i<size; i++)
		{
			if(table[i] == null)
			{
				System.out.println(i + "  *********");
			}else
			{
				System.out.println(i + "  " + table[i].getPresident().getName());
			}
		}
		System.out.println("\n");
	}

	@Override
	protected int hashFunc(String name) {
		
			int hashVal = 0;
			
			for(int i=0; i<name.length(); i++ )//start at the end of the name
			{
				
				int letter =  (int)name.charAt(i)-96;
				hashVal += letter; 
			}
		return hashVal % size;
	}

	@Override
	public void insert(President prez) {
		
		DataItem p = new DataItem(prez);
		
		int hashVal = hashFunc(p.getPresident().getName());
		
		while(table[hashVal] != null && table[hashVal].getPresident().getName() != null )
		{
			++hashVal; //next cell
			hashVal %= size; // wrap around if necessary
		}
		
		table[hashVal] = p;
	}

	@Override
	public DataItem delete(String name) 
	{
		int hashVal = hashFunc(name);
		
		while(table[hashVal] != null)
		{
			if(table[hashVal].getPresident().getName().equals(name))
			{
				DataItem temp = table[hashVal];
				table[hashVal] = nonItem;
				return temp;
			}
			++hashVal;
			hashVal %= size;
		}
		return null;
	}

	@Override
	public DataItem find(String name) {
		int hashVal = hashFunc(name);
		
		while(table[hashVal] != null)
		{
			if(table[hashVal].getPresident().getName().equals(name))
			{
				return table[hashVal];
			}
			++hashVal;
			hashVal %= size;
		}
		return null;
	}
}
