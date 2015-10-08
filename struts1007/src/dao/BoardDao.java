package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.BoardVo;

public class BoardDao {
	private static BoardDao dao;
	public static synchronized BoardDao getDao(){
		if ( dao == null ) dao = new BoardDao();
		return dao;
	}
	
	public void insert(BoardVo vo){
		SqlSession ss = FactoryService.getFactory().openSession(true);// auto Commit 설정
		ss.insert("board.add",vo);
		ss.close();
		

	}
	public List<BoardVo> list(){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<BoardVo> list=ss.selectList("board.list");
		ss.close();
		return list;
	}
	
	public BoardVo getlistOne(int num){
		SqlSession ss = FactoryService.getFactory().openSession();
		BoardVo vo=ss.selectOne("board.detail",num);
		ss.close();
		return vo;
	}
	
	
}