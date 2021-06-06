package lms.service;

import java.util.ArrayList;


import lms.dao.LmsDao;
import lms.vo.SubjectVO;

public class LmsService {
	private static LmsService service = new LmsService();
	private LmsService() {}
	private LmsDao dao = LmsDao.getInstance();
	public static LmsService getInstance()
	{
		return service;
	}
	public boolean Studentlogin(String id, String pwd) {
		return dao.Studentlogin(id,pwd);
	}
	public boolean Proflogin(String id, String pwd) {
		return dao.Proflogin(id,pwd);
	}
	public ArrayList<SubjectVO> subjList() {
		// TODO Auto-generated method stub
		ArrayList<SubjectVO> list = dao.subjList();
		return list;
	}
	public SubjectVO Search(String id)
	{
		SubjectVO subj = dao.Search(id);
		return subj;
	}
	public void subjEnroll(SubjectVO subj)
	{
		dao.subjEnroll(subj);
	}
}
