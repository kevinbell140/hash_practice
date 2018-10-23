
import java.util.*;

public class DataItem {

	private President p;
	private int deleted;
	
	public DataItem(President p)
	{
		this.p = p;
		this.deleted = 0;
	}
	
	public DataItem(President p, int d)
	{
		this.p = p;
		this.deleted = d;
	}
	
	public President getPresident()
	{
		return p;
	}
	
	public void setPresdient(President p)
	{
		this.p = p;
	}
	
	public int getDeleted()
	{
		return deleted;
	}
	
	public void setDeleted(int d)
	{
		deleted = d;
	}
	
	
}
