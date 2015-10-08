package controller;

public class Exam01 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 문자열로 path를
		String rpath= "controller.ExamBase";
		// class.forName 으로 객체를 로드해서 
		Class<ExamBase> handlerCalss = (Class<ExamBase>) Class.forName(rpath);
		// newInstance 메서드로 객체를 생성한 후 사용함 
		handlerCalss.newInstance().test();
	}
}
