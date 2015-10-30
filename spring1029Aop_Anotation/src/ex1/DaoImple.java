package ex1;

public class DaoImple implements DaoInter{

	@Override
	public void first() {
		// 100 만건의 데이터를 database에 저장하는 메소드 
		
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(i+" ");
			}			
			System.out.println("END");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String second() {
		StringBuffer sb= new StringBuffer();
		sb.append("-------------------").append("\n");
		sb.append("김길동").append("\n");
		sb.append("-------------------").append("\n");
		return sb.toString();
	}

	@Override
	public void third() {// TODO Auto-generated method stub
		String[] ar ={"메세지1","메세지2" ,"메세지3" ,"메세지4","메세지5"};
		for (int i= 0; i <=ar.length; i++) {
			System.out.println("비지니스 로직 "+ar[i]);
		}
	}

}
