package com.iu.s2.qna;




import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s2.util.Pagers;

@Repository
public class QnaDAO {
		
		@Autowired
		private SqlSession sqlSession;
		private final String NAMESPACE="com.iu.s2.qna.QnaDAO.";
		
		
		public Long getQnaCount(Pagers pagers) throws Exception{
			return sqlSession.selectOne(NAMESPACE+"getQnaCount", pagers);
		}
		
		public List<QnaDTO> getQnaList(Pagers pagers) throws Exception{
			System.out.println("넘어오냐?1");
			return sqlSession.selectList(NAMESPACE+"getQnaList", pagers);
		}
		
		public QnaDTO getQnaDetail(QnaDTO qnaDTO) throws Exception{
			return sqlSession.selectOne(NAMESPACE+"getQnaDetail", qnaDTO);
		}
		public int setQnaAdd(QnaDTO qnaDTO) throws Exception{
			return sqlSession.insert(NAMESPACE+"setQnaAdd", qnaDTO);
		}
		public int setQnaImgAdd(QnaImgDTO qnaImgDTO) throws Exception{
			return sqlSession.insert(NAMESPACE+"setQnaImgAdd", qnaImgDTO);
		}
}
