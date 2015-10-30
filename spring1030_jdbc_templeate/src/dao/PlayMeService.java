package dao;

import java.util.List;

import vo.PlayMeVo;

public interface PlayMeService {
	public void add(PlayMeVo vo);
	public List<PlayMeVo> getList();
	public PlayMeVo getView(int num);
}
