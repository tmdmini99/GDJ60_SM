package com.iu.s2.notice;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s2.util.Pager;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s2.notice.NoticeDAO.";
	
	
	public Long getNoticeCount(Pager pager) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getNoticeCount", pager);
	}
	
	public List<NoticeDTO> getNoticeList(Pager pager) throws Exception{
		return sqlSession.selectList(NAMESPACE+"getNoticeList",pager);
	}
	public NoticeDTO getNoticeDetail(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getNoticeDetail", noticeDTO);
	}
	public int setNoticeAdd(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"setNoticeAdd",noticeDTO);
	}
	public int setNoticeUpdate(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"setNoticeUpdate", noticeDTO);
	}
	public int setNoticeDelete(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"setNoticeDelete", noticeDTO);
	}
	public int setNoticeFileAdd(NoticeImgDTO noticeImgDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"setNoticeFileAdd", noticeImgDTO);
	}
	public int setNoticeUpdate1(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"setNoticeUpdate1", noticeDTO);
	}
	
	
}
