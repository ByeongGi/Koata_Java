package ex1;
// @author kosta, 2015. 8. 25 , 오전 9:07:03 , MemberJoin 
public class MemberJoin {
    // 아는 것 - 사용자의 정보 
    // private String id,pwd,name;
    // private int age; 
    private MemberVo vo; // MemberVo 로 변수로 변경
    // => 늘어나는 비지니스 로직에 대해서 유연하게 반응(고객의 요구에 보다 더 반응적으로)하기 위해서 POJO의 VO를 사용 
    
    // 동작은 - Setter, 사용자의 정보를 입력
    // 가입 조건 ---
    // 성년인지 미성년인지 판별 
    // 아이디도 5 자리 이상만 가입 
    
    public void addMember(MemberVo vo){
        // this란 키워드는 현재 클래스의 주소를 의미 
        // 현재 클래스의 자원을 표시할 때 사용한다.
        // 예) this.id 는 현재 클래스의 멤버필드인 id를 가리킨다.
        boolean status =true; // 유효성 검사가 true 일 때 만 나머지 정보를 등록한다.
        // id 유효성 검사 
        if (checkid(vo.getId())) 
        {
           // this.id= memberVo.getId();
        }else {
            System.out.println("아이디가 5자 이상입니다.");
            status = false;
        }
        // 미성년자 여부 검사 
        if (checkAge(vo.getAge())) 
        {
          //  this.age= memberVo.getAge();
            System.out.println("당신은 성년입니다.");
        } else{
            System.out.println("당신은 미성년 입니다.");
             status = false;
        }
        // 미성년자 id 유효성 체크 후  이름과 비밀번호 저장 
        if (status) {
            // this.pwd= memberVo.getPwd();
            // this.name= memberVo.getName();
            this.vo =vo;
            System.out.println("가입이 완료 되었습니다");
        }
        
    } // end adddMember()
    
    public boolean checkid(String id ){
        //   the length of the sequence of characters represented by this object.
        if (id.length()<=5) { // 문자열의 길이를 리턴 length()
           return false;
        }else {
            return true;
        }
    } // enc checkid()
    
    public boolean checkAge(int age){
        if (age<=19)
        {   
            return false;
        } else{   
            return true;
        }
    } // end checkAge()
    
} // end calss 
