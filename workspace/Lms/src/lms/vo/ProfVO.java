package lms.vo;

public class ProfVO {
	private String id;
	private String pwd;
	private String name;
	public ProfVO() {}
	public ProfVO(String tId,String tPwd, String tName)
	{
		this.id  = tId;
		this.pwd = tPwd;
		this.name = tName;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String tId)
	{
		this.id = tId;
	}
	public String getPwd()
	{
		return pwd;
	}
	public void setPwd(String tPwd)
	{
		this.pwd = tPwd;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String tName)
	{
		this.name = tName;
	}
}
