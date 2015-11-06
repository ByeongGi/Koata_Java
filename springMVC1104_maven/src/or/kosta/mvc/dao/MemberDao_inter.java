package or.kosta.mvc.dao;

import java.util.List;
import java.util.Map;

import or.kosta.mvc.vo.MemberVo;

public interface MemberDao_inter {
	public int idChk(String id);
	public int insert(MemberVo vo);
	public List<MemberVo> paging_list(Map<String, Object> data);
	public int totalCnt();
}
