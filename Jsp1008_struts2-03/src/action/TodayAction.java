package action;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayAction {
	// ValueSatack
	private String msg;

	public TodayAction() {
		System.out.println("TodayAction 생성");
	}

	// 액션 호출기가 호출하는 메서드 예약 execute()
	public String execute() throws Exception {
		System.out.println("execute 호출!");
		String date = new SimpleDateFormat("YYYY 년 MM 월 dd 일 ").format(new Date());
		this.msg = date; // ValueStack에 값을 하는것
		// return 되는 값을 통해서 화면도 분기가 가능하다
		return "success";
	}

	// getter 를 제공해서 뷰에서 값을 인출할수 있는 프로퍼티를 제공해야한다.
	public String getMsg() {
		return msg;
	}

}
