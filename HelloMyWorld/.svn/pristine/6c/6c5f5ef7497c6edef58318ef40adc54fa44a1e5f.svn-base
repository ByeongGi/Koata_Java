/*
	 구현 사항:	
	 2015.10.15
	 @author 김선우
*/

package action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.ArticleDao;
import vo.ArticleVo;

public class ArticleViewAction implements Action, Preparable, ModelDriven<ArticleVo> {

	private ArticleVo vo;
	private List<ArticleVo> list;
	private int article_id;
	
	
	@Override
	public String execute() throws Exception {
		vo = ArticleDao.getInstance().getArticleDetail(article_id);
		// 상세 보기에서 댓글 리스트로 불러 온다.
		//list = ArticleDao.getInstance().bbs_view(no);
		return SUCCESS;
	}
	@Override
	public ArticleVo getModel() {
		return vo;
	}
	@Override
	public void prepare() throws Exception {
		this.vo = new ArticleVo();
	}
	
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
    
	

}
