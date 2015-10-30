package exam3.ioc_container;

public class Bean_Interface_Imp implements Bean_Interface{

	@Override
	public String msg(String msg) {
		return "당신이 생성자에 초기화 시킨 값: "+msg;
	}

}
