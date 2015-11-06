package dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import vo.Bbs1CommVo;
import vo.Bbs1Vo;

public class Bbs1Dao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	// Spring에서 제공하는 Template를 사용하면 commit , close를 자동으로 해준다.
	public void insertBbs1(Bbs1Vo vo){
		sqlSessionTemplate.insert("bbs1.ins", vo);
	}
	public List<Bbs1Vo> getList(){
		return sqlSessionTemplate.selectList("bbs1.list");
	}
	public Bbs1Vo getDetail(int num){
		return sqlSessionTemplate.selectOne("bbs1.detail",num);
	}
	public void insertComm(Bbs1CommVo vo){
		sqlSessionTemplate.insert("bbs1.commIn", vo);
	}
	public List<Bbs1CommVo> getCommList(int kcode){
		return sqlSessionTemplate.selectList("bbs1.commList",kcode);
	}
	
	
}
