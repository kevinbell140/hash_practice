
import java.util.*;
import java.io.*;

public abstract class HashTable {

	private DataObj[] table;
	private DataObj nonObj; 
	protected int size;
	private ArrayList<President> prezArray;
	
	public HashTable(ArrayList<President> prezArray, int size)
	{
		
		this.prezArray = prezArray;
		this.size = size;
		this.table = new DataObj[size];
		nonObj = new DataObj(null, -1);   //for deletes
	}
	
	public abstract void display();
	

	public abstract int hashFunc(ArrayList<President> prezArray);
	
	public abstract void insert(DataObj data);
	
	public abstract DataObj delete(long key);
	
	public abstract DataObj find();
	
}
