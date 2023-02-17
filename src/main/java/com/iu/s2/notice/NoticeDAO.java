package com.iu.s2.notice;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s2.notice.NoticeDAO.";
	
	
	public List<NoticeDTO> getNoticeList() throws Exception{
		return sqlSession.selectList(NAMESPACE+"getNoticeList");
	}
	public void getNoticeDetail() {
		
	}
	public int setNoticeAdd(NoticeDTO noticeDTO) {
		return sqlSession.insert(NAMESPACE+"setNoticeAdd",noticeDTO);
	}
	public int setNoticeUpdate(NoticeDTO noticeDTO) {
		return sqlSession.update(NAMESPACE+"setNoticeUpdate", noticeDTO);
	}
	public int setNoticeDelete(NoticeDTO noticeDTO) {
		return sqlSession.delete(NAMESPACE+"setNoticeDelete", noticeDTO);
	}
	
	
}
