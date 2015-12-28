/**
 * ���� ����:
 * 		
 * 2015.10.15
 * @author �ڼ���
 */
package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.ArticleVo;

public class ArticleDao {
	private static ArticleDao dao;
	private ArticleVo v;
	
	private ArticleDao() {
	}
	public static synchronized ArticleDao getInstance() {
		if(dao == null) dao = new ArticleDao();
		return dao;
	}
	//--------------------------------------------------select list, count ��� ����
	public int selectCount() {//��ü ��ƼŬ �� '����'�� �ҷ����� �޼���
		SqlSession ss = FactoryService.getFactory().openSession();
		int res = ss.selectOne("article.selectCount");//map.xml count(*) ��ü ���� �޾ƿ��� sql�� �ʿ�
		ss.close();
		return res;
	}
	public List<ArticleVo> select() {//��ü ��� �ҷ����� �޼���
		SqlSession ss = FactoryService.getFactory().openSession();
		List<ArticleVo> list = ss.selectList("article.selectList");//map.xml ��ü ��� �޾ƿ��� sql �ʿ�
		ss.close();
		return list;
	}	
	public ArticleVo getArticleDetail(int Article_num) {//��ƼŬ�� �� ������ �ҷ���
		SqlSession ss = FactoryService.getFactory().openSession();
		ArticleVo v= ss.selectOne("article.detail",Article_num);//��ȣ�� Ư���� Article �������� sql
		ss.close();
		return v;
	}
	public void writeArticle(ArticleVo v) {//��ƼŬ �ۼ��ϸ� db�� ���
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.insert("article.insert",v);//db�� �Է��ϴ� sql
		ss.close();
	}
	public void deleteArticle(int Article_num) {//��ƼŬ �ۼ��ϸ� db�� ���
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.delete("article.delete", Article_num);
		ss.close();
	}
	public void updateArticle(ArticleVo v) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("article.update",v);
		ss.close();
	}
	public void hitArticle(int Article_num) {
		SqlSession ss = FactoryService.getFactory().openSession(true);
		ss.update("article.update",Article_num);
		ss.close();
	}
	
}










