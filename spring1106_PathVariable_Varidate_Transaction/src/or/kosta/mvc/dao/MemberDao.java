package or.kosta.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import or.kosta.mvc.vo.MemberVo;
@Repository
public class MemberDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	public void memberAdd(MemberVo vo){
		sqlSessionTemplate.insert("mem.memberAdd",vo);
	}
	
	
}
