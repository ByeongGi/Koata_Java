package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.Chat_Vo;

public class ChatDao {
	private static ChatDao cDao;
	private ChatDao(){}
	public static synchronized ChatDao getDao(){
		if (cDao==null) cDao = new ChatDao();
		return cDao;
	}
	
	public int add(Chat_Vo vo){
		SqlSession ss = FactoryService.getFatory().openSession();
		int res=ss.insert("chat.chroom",vo);
		ss.commit();
		ss.close();
		return res;
	}
	
	
	public List<Chat_Vo> getList(){
		SqlSession ss = FactoryService.getFatory().openSession();
		List<Chat_Vo> list =ss.selectList("chat.chlist");
		return list;
	}
	
	
	
	
	
}
