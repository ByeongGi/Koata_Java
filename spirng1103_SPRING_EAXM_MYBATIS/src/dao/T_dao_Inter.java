package dao;

import java.util.List;
import java.util.Map;

import vo.TestVo;

public interface T_dao_Inter {
	public int insert(TestVo vo);
	public List<TestVo> list(Map<String,Object> data);
	public TestVo selectOne(int num);
	public int select_Total_Cnt();
}
