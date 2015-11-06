/*
	 구현 사항:	
	 2015.10.15
	 @author 김선우
*/

package action;

import java.util.List;

import com.opensymphony.xwork2.Action;

import dao.ArticleDao;
import vo.ArticleVo;

public class ArticleListAction implements Action {

	private List<ArticleVo> list;
	
	public List<ArticleVo> getList() {
		return list;
	}

	@Override
	public String execute() throws Exception {
		ArticleDao.getInstance().select();
		return SUCCESS;
	}

	
}
