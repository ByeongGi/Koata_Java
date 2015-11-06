package or.kosta.mvc.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import or.kosta.mvc.vo.Bbs1CommVo;
import or.kosta.mvc.vo.Bbs1Vo;

@Repository
public class Bbs1Dao {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	// Spring에서 제공하는 Template를 사용하면 commit , close를 자동으로 해준다.
	public void insertBbs1(Bbs1Vo vo){
		sqlSessionTemplate.insert("bbs1.ins", vo);
	}
	public List<Bbs1Vo> getList(HashMap<String,Object> data){
		return sqlSessionTemplate.selectList("bbs1.list",data);
	}
	
	public int Cnt(){
		return sqlSessionTemplate.selectOne("bbs1.cnt");
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
	public List<Bbs1Vo> getSearchList(HashMap<String,Object> data){
		return sqlSessionTemplate.selectList("bbs1.searchlist", data);
	}
	
	public List<Bbs1Vo> searchDown(HashMap<String,Object> data){
		return sqlSessionTemplate.selectList("bbs1.searchDown", data);
	}
	
	public int searchCnt(HashMap<String,Object> data){
		return sqlSessionTemplate.selectOne("bbs1.searchcnt", data);
	}
	
	
}
