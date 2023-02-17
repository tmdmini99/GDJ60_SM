package com.iu.s2.qna;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class QnaDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.s2.qna.QnaDAO.";
	
	public List<QnaDTO> getQnaList() throws Exception{
		return sqlSession.selectList(NAMESPACE+"getQnaList");
		
	}
	
	
	
}
