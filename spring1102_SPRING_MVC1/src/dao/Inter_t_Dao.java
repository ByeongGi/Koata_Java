package dao;

import java.util.List;

import vo.TestVo;

public interface Inter_t_Dao {
	public int insert(TestVo vo);
	public List<TestVo> list();
	public TestVo selectOne(int num);
}
