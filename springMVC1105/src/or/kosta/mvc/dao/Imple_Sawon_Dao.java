package or.kosta.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import or.kosta.mvc.vo.SawonPayVo;

@Repository
public class Imple_Sawon_Dao implements Inter_Sawon_Dao{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	
	@Override
	public int insert(SawonPayVo vo) {
		return sqlSessionTemplate.insert("sawonpay.insert",vo);
	}

	@Override
	public List<SawonPayVo> selectList() {
		return sqlSessionTemplate.selectList("sawonpay.selectList");
	}

}
