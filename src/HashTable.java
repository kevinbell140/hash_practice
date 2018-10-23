
import java.util.*;
import java.io.*;

public abstract class HashTable {

	protected DataItem[] table;
	protected DataItem nonItem; 
	protected int size;
	
	public HashTable(int size)
	{
		
		this.size = size;
		this.table = new DataItem[size];
		nonItem = new DataItem (null, 1);   //for deletes
	}
	
	public abstract void display();
	
	protected abstract int hashFunc(String name);
	
	public abstract void insert(President p);
	
	public abstract DataItem delete(String name);
	
	public abstract DataItem find(String name);
	
}
