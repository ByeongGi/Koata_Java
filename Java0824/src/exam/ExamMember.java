package exam;
// POJO 의 개념 
// 1. 상속받지 않는 클래스이다.
// 2. 외부로부터 생성자에 의해서 필드값이 변경되지 않는다.
// 3. 내부의 필드는 getter and setter 의해서만 변경된다.
// 4. 필드는 모두 Priavate 처리 
// @author kosta, 2015. 8. 24 , 오전 10:46:01 , ExamMember 
public class ExamMember {
    private String name;
    private int age;
    private boolean agree;

    public ExamMember() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getAgree() {
        return agree;
    }

    public void setAgree(boolean agree) {
        this.agree = agree;
    }
 } // end class of ExamMember
