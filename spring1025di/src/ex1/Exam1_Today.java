package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam1_Today {
	private String today;
	public void setToday(String today) {
		this.today = today;
	}
	public String printToday(){
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
		String today = date.format(new Date());
		
		return today;
	}
	public String getToday() {
		return today;
	}
	
	

}
