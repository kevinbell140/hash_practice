
import java.util.*;
import java.io.*;

public class DataObj {


	private long hashval;
	private President prez;
	
	public DataObj(President p, long h)
	{
		prez = p;
		hashval = h;
	}
	

	public long getHashVal()
	{
		return hashval;
	}
	
	public President getPrez()
	{
		return prez;
	}
	
}
