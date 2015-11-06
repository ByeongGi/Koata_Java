package or.kosta.mvc.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

import or.kosta.mvc.vo.MemberVo;

@Repository
public class MemberDao implements MemberDao_inter{
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	@Override
	public int idChk(String id){
		int res=sqlSessionTemplate.selectOne("member.idChk", id);
		return res;
	}
	
	@Override
	public int insert(MemberVo vo){
		int res=sqlSessionTemplate.insert("member.insert", vo);
		return res;
	}
	
	
	
	@Override
	public int totalCnt(){
		int res=sqlSessionTemplate.selectOne("member.totalCnt");
		return res;
	}
	
	@Override
	public List<MemberVo> paging_list(Map<String, Object> data){
		List<MemberVo> list =sqlSessionTemplate.selectList("member.paging_list",data);
		return list;
	}


	
}
