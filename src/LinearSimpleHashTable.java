import java.util.*;

public class LinearSimpleHashTable extends HashTable{

	public LinearSimpleHashTable(ArrayList<President> prezArray, int size) 
	{ 
		super(prezArray, size);
		hashFunc(prezArray);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashFunc(ArrayList<President> prezArray) {
		
		for (President p : prezArray)
		{
			int hashVal = 0;
			
			for(int i=p.getName().length(); i<=0; i-- )//start at the end of the name
			{
				
				int letter =  (int)p.getName().charAt(i)-96;
				hashVal += letter; 
			}
			
			
		}
		

		return hashVal % size;
	}

	@Override
	public void insert(DataObj data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DataObj delete(long key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataObj find() {
		// TODO Auto-generated method stub
		return null;
	}
}
