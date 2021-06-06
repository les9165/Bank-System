package lms.dao;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import lms.vo.SubjectVO;

public class LmsDao {
	private static LmsDao dao = new LmsDao();
	private LmsDao() {}
	public static LmsDao getInstance() {
		return dao;
	}
	
	public Connection connect()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS","root", "0331");
		}catch(Exception e){
			System.out.println("DAO:connect"+e);
		}
		return conn;
	}
	public void close(Connection conn, PreparedStatement pstmt)
	{
		if(pstmt != null)
		{
			try {
				pstmt.close();
			}catch(Exception e) {
				System.out.println("close error"+ e);
			}
		}
		if(conn != null)
		{
			try {
				conn.close();
			}catch(Exception e)
			{
				System.out.println("Conn close error" + e);
			}
		}
	}
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs)
	{
		if(rs != null)
		{
			try {
				rs.close();
			}catch(Exception e) {
				System.out.println("rs close error" + e);
			}
		}
		close(conn,pstmt);
	}
	public boolean Studentlogin(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from student where id = ? and pwd = ?;" );
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();if(rs.next())
			{
				result = true;
			}
			else
				result = false;
		}catch(Exception e)
		{
			System.out.println("error"+e);
		}finally {
			close(conn,pstmt);
		}
		return result;
	}
	public boolean Proflogin(String id, String pwd) {
		// TODO Auto-generated method stub
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from prof where id = ? and pwd = ?;" );
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();if(rs.next())
			{
				result = true;
			}
			else
				result = false;
		}catch(Exception e)
		{
			System.out.println("error"+e);
		}finally {
			close(conn,pstmt);
		}
		return result;
	}
	public ArrayList<SubjectVO> subjList() {
		// TODO Auto-generated method stub
		ArrayList<SubjectVO> list = new ArrayList<SubjectVO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		SubjectVO subj = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from subject " );
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				subj = new SubjectVO();
				subj.setId(rs.getString(1));
				subj.setName(rs.getString(2));
				subj.setCount(rs.getInt("count"));
				subj.setProf(rs.getString("prof"));
				list.add(subj);
			}}catch(Exception e)
			{
				System.out.println("error"+e);
			}finally {
				close(conn,pstmt,rs);
			}
		return list;
		}

	public SubjectVO Search(String id) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		SubjectVO subj = null;
		try
		{
			conn = connect();
			pstmt = conn.prepareStatement("select * from subject where id=?;");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				subj = new SubjectVO();
				subj.setId(rs.getString("id"));
				subj.setName(rs.getString("name"));
			}
		}catch(Exception e) {
			System.out.println("error");
		}finally
		{
			close(conn,pstmt,rs);
		}
		return subj;
	}
	public void subjEnroll(SubjectVO subj)
	{
		Connection conn = null;
		PreparedStatement pstmt = null;
		try 
		{
			conn = connect();
			pstmt = conn.prepareStatement("Insert into subject values(?,?,?,?);");
			pstmt.setString(1, subj.getId());
			pstmt.setString(2, subj.getName());
			pstmt.setInt(3, subj.getCount());
			pstmt.setString(4, subj.getProf());
			pstmt.executeUpdate();
		
		}catch(Exception e)
		{
			System.out.println("DAO:"+e);
		}finally {
			close(conn,pstmt);
		}
	}
	}


	


