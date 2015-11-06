package or.kosta.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import or.kosta.mvc.vo.Bbs1Vo;

public class ExcelBuilder extends AbstractExcelView{
	// excelView를 찾으면 , 이것을 현재 클래스에 ExcelBuilder 가 
	// AbstractExcelView 를 상속했기 때문에 이것은 View이다.
	// DispathcherServlect -> [view]jsp (model) : forword
	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// HSSF  - 마이크로 소트트 엑셀 전용 클래스
		// DispathcherServlect 에 의해서  Model을 받습니다.
		// ${listBooks}
		List<Bbs1Vo> listBooks = (List<Bbs1Vo>) model.get("listBooks");
		
		// poi 문법
		
		HSSFSheet sheet = workbook.createSheet("Show Books");
		sheet.setDefaultColumnWidth(30);
		
		// CellStyle 지정 
		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(HSSFColor.BLUE.index);
		style.setFillPattern(CellStyle.SOLID_FOREGROUND);
		
		Font font = workbook.createFont();
		font.setFontName("Arial");
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setColor(HSSFColor.WHITE.index);
		// 폰트 지정
		style.setFont(font);
		
		// 엑셀의 타이틀 
		/*
		 
		 NUM
		SUB
		WRITER
		PWD
		CONT
		REIP
		HIT
		REGDATE 
		
		 */
		HSSFRow header = sheet.createRow(0);
		String[] str ={"NUM" , "주제" , "작성자", "비밀번호" , "내용" , "아이피" , "조회후", "작성일자" };
		for (int i = 0; i < str.length; i++) {
			header.createCell(i).setCellValue(str[i]);
			header.getCell(i).setCellStyle(style);
		}
		int rowCount =1;
		for (Bbs1Vo aBook : listBooks) {
			HSSFRow aRow = sheet.createRow(rowCount++);
			aRow.createCell(0).setCellValue(aBook.getNum());
			aRow.createCell(1).setCellValue(aBook.getSub());
			aRow.createCell(2).setCellValue(aBook.getWriter());
			aRow.createCell(3).setCellValue(aBook.getPwd());
			aRow.createCell(4).setCellValue(aBook.getCont());
			aRow.createCell(5).setCellValue(aBook.getReip());
			aRow.createCell(6).setCellValue(aBook.getHit());
			aRow.createCell(7).setCellValue(aBook.getRegdate());
		}
		response.setCharacterEncoding("uft-8");
		response.setContentType("Application/Msexcel");
		response.setHeader("Content-Disposition", "attachment; filename =bbs1_exce.xls;");
		
	}

}
