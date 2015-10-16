package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import factory.FactoryService;
import vo.BoardVo;
import vo.PaginVo;

public class BoardDao {
	private static BoardDao dao;
	public static synchronized BoardDao getDao(){
		if ( dao == null ) dao = new BoardDao();
		return dao;
	}
	
	public void insert(BoardVo vo){
	
		SqlSession ss = FactoryService.getFatory().openSession(true);// auto Commit 설정
		ss.insert("board.add",vo);
		ss.close();
		

	}
	public List<BoardVo> list(){

		SqlSession ss = FactoryService.getFatory().openSession();
		List<BoardVo> list=ss.selectList("board.list");
		ss.close();
		return list;
	}
	
	public BoardVo getlistOne(int no){
	
		SqlSession ss = FactoryService.getFatory().openSession();
		BoardVo vo=ss.selectOne("board.detail",no);
		ss.close();
		return vo;
	}
	
	public List<BoardVo> getList(PaginVo vo){
		SqlSession ss = FactoryService.getFatory().openSession();
		List<BoardVo> list=ss.selectList("board.list2",vo);
		return list;
	}
	
	public int getTotalCount(){
		SqlSession ss = FactoryService.getFatory().openSession();
		int cnt =ss.selectOne("board.tatal");
		System.out.println("total cnt");
		return cnt;
	}
	
	
	public void setHit(int no){
		SqlSession ss = FactoryService.getFatory().openSession(true);
		ss.update("board.hit",no);
		ss.close();
	}
	
	
	
	
}