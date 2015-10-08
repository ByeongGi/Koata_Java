package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import factory.FactoryService;
import vo.MiniBoardVo;

public class MiniBoardDao {
	private static MiniBoardDao dao;
	public static synchronized MiniBoardDao getDao(){
		if ( dao == null ) dao = new MiniBoardDao();
		return dao;
	}
	
	public void insert(MiniBoardVo vo){
		SqlSession ss = FactoryService.getFatory().openSession(true);// auto Commit 설정
		ss.insert("miniboard.add",vo);
		ss.close();
		

	}
	public List<MiniBoardVo> list(){
		SqlSession ss = FactoryService.getFatory().openSession();// auto Commit 설정
		List<MiniBoardVo> list=ss.selectList("miniboard.list");
		ss.close();
		return list;
	}
	
	public MiniBoardVo getlistOne(int num){
		SqlSession ss = FactoryService.getFatory().openSession(true);
		MiniBoardVo vo=ss.selectOne("miniboard.detail",num);
		ss.close();
		return vo;
	}
	
}
