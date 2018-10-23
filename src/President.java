
public class President {

	private int num;
	private String name;
	private int term;
	private String party;
	private String state;
	
	public President(int n, String na, int t, String p, String s)
	{
		num = n;
		name = na;
		term = t;
		party = p;
		state = s;
	}

	
	public int getNum() {
		return num;
	}
	public void setNum(int n) {
		num = n;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
	public int getTerm() {
		return term;
	}
	public void setTerm(int t) {
		term = t;
	}
	
	public String getParty() {
		return party;
	}
	public void setParty(String p) {
		party = p;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String s) {
		state = s;
	}
	
}
