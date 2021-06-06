package lms.vo;

public class EnrollVO  {
	private String student;
	private String subject;
	public EnrollVO() {}
	public EnrollVO(String tStudent,String tSubject)
	{
		this.student  = tStudent;
		this.subject = tSubject;
	}
	public String getStudent()
	{
		return student;
	}
	public void setStudent(String tStudent)
	{
		this.student = tStudent;
	}
	public String getSubject()
	{
		return subject;
	}
	public void setSubject(String tSubject)
	{
		this.subject = tSubject;
	}
	

}
