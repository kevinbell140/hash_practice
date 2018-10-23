
/**
 * @author kebell
 *
 */

import java.util.*;


import java.io.*;


public class File {

	private FileReader fr;
	private BufferedReader br;
	private ArrayList<String> data;
	private ArrayList<President> prezArray;
	//private String line;
	
	//constructor for file
	public File(String f)
	{
		try 
		{
			prezArray = new ArrayList<President>();
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			getData();
			printArray();

		}catch (Exception e)
		{
			System.out.println("File Not Found");
		}
	}//end constructor
	
	private void getData()
	{
		String line;
		data = new ArrayList<String>();
		try
		{
			while((line = br.readLine()) != null)
			{
				data.add(line);
			}
			parseData();
		}catch(IOException e)
		{
			System.out.println("IO Exception");
		}
	}
		
	private void parseData()
	{
		for (String s : data) {
			String[] info = s.split(",");
			makePresident(info);
		}
	}
	
	private void makePresident(String[] info)
	{
		int num = Integer.parseInt(info[0]);
		String name = info[1];
		int term = Integer.parseInt(info[2]);
		String party = info[3];
		String state = info[4];
		
		President prez = new President(num, name, term, party, state);

		prezArray.add(prez);
	}
	
	
	public void printArray()
	{
		for (President prez : prezArray)
		{
			System.out.println(prez.name);
		}
	}	
	
	
	public ArrayList<President> getArray()
	{
		return prezArray;
	}	
}
