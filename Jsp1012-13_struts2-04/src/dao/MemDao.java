package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import factory.FactoryService;
import vo.MemberVo;

public class MemDao {
	private static MemDao mDao;
	private MemDao(){}
	public static synchronized MemDao getDao(){
		if (mDao==null) mDao = new MemDao();
		return mDao;
	}
	
	public int addMem(MemberVo vo){
		SqlSession ss = FactoryService.getFatory().openSession();
		int res=ss.insert("mem.add",vo);
		ss.commit();
		ss.close();
		return res;
	}
	public int idchk(String id){
		SqlSession ss = FactoryService.getFatory().openSession();
		int res = ss.selectOne("mem.idchk", id);
		ss.close();
		return res;
	}
	
	public List<MemberVo> getList(){
		SqlSession ss = FactoryService.getFatory().openSession();
		List<MemberVo> list =ss.selectList("mem.memAll");
		return list;
	}
	
	public int update(MemberVo vo){
		SqlSession ss = FactoryService.getFatory().openSession();
		int res=ss.update("mem.memUp", vo);
		ss.commit();
		ss.close();
		return res;
	}
	
	public int delete(int num){
		SqlSession ss = FactoryService.getFatory().openSession();
		int res=ss.delete("mem.memDel", num);
		ss.commit();
		ss.close();
		return res;
		
	}
	
	public MemberVo getSelectOne(int num){
		SqlSession ss = FactoryService.getFatory().openSession();
		MemberVo vo =ss.selectOne("mem.selectOne", num);
		ss.close();
		return vo;
	}
	public List<MemberVo> getMember(String name){
		SqlSession ss = FactoryService.getFatory().openSession();
		List<MemberVo> list =ss.selectList("mem.searchMem", name);
		ss.close();
		return list;
	}
	
	
	public int login(Map map){
		SqlSession ss = FactoryService.getFatory().openSession();
		int vo =ss.selectOne("mem.login", map);
		ss.close();
		return vo;
	}
	
}
