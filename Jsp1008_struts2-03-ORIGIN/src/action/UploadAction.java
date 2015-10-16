package action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import dao.BoardDao;
import service.FileService;
import vo.BoardVo;

//Acion�� �����ϴ� 3��° ���
public class UploadAction extends ActionSupport implements Preparable, ModelDriven<BoardVo> {
	private BoardVo vo;
	// ���� ���ε� ���� ����� �߰�
	private File upload;
	private String uploadFileName, uploadContentType;

	@Override
	public String execute() throws Exception {
		
		HttpServletRequest req = ServletActionContext.getRequest();
		System.out.println("log"+req.getContextPath());
		System.out.println(req.getRealPath("/upload"));
		 
		System.out.println(vo.getTitle());
		System.out.println("FileName:" + upload.getName());
		System.out.println("FileName:" + upload);
		System.out.println("uploadFileName:" + uploadFileName);
		System.out.println("uploadContentType:" + uploadContentType);

		// getText()로 properties 파일의 키를 불러낸다.
		// extends ActionSupport 를 상속받은 이유 중에 하나
		String basePath = getText("file.path");

		// 파일을 복사 
		FileService service = new FileService();
		String path = service.saveFile(upload, basePath, uploadFileName);
		// vo 에 파일 이름을 저장 
		vo.setImg(uploadFileName);
		/*System.out.println("vo : " +vo.getContent());
		System.out.println("vo : " +vo.getImg());
		System.out.println("vo : " +vo.getTitle());
		System.out.println("vo : " +vo.getWriter());
		System.out.println("vo : " +vo.getGroupno());*/
		BoardDao.getDao().insert(vo);
		return SUCCESS;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public void setVo(BoardVo vo) {
		this.vo = vo;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	@Override
	public BoardVo getModel() {
		return vo;
	}

	@Override
	public void prepare() throws Exception {
		vo = new BoardVo();
	}
}
