package or.kosta.mvc.dao;

import java.util.List;

import or.kosta.mvc.vo.SawonPayVo;

public interface Inter_Sawon_Dao {
	public int insert(SawonPayVo vo);
	public List<SawonPayVo> selectList();
}
