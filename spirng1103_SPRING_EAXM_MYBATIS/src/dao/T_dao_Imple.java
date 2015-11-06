package dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import vo.TestVo;

public class T_dao_Imple implements T_dao_Inter{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public int insert(TestVo vo) {
		return sqlSessionTemplate.insert("tvo.insert",vo);
	}

	@Override
	public List<TestVo> list(Map<String,Object> data) {
		List<TestVo> list=sqlSessionTemplate.selectList("tvo.selectList",data);
		return list;
	}

	@Override
	public TestVo selectOne(int num) {
		return (TestVo)sqlSessionTemplate.selectOne("tvo.selectOne",num);
	}

	
	@Override
	public int select_Total_Cnt() {
		return sqlSessionTemplate.selectOne("tvo.select_Total_Cnt");
	}

}
