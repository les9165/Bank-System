package lms.vo;

public class SubjectVO {
	private String id;
	private String name;
	private int count;
	private String prof;
	public SubjectVO() {}
	public SubjectVO(String tId,String tName,String tPwd, String tProf)
	{
		this.id = tId;
		this.name = tPwd;
		this.count = 0;
		this.prof = tProf;
	}

	public String getId()
	{
		return id;
	}
	public void setId(String tId)
	{
		this.id = tId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String tName)
	{
		this.name = tName;
	}
	public int getCount()
	{
		return count;
	}
	public void setCount(int tCount)
	{
		this.count = tCount;
	}
	public String getProf() {
		// TODO Auto-generated method stub
		return prof;
	}
	public void setProf(String tProf)
	{
		this.prof = tProf;
	}
	

}
