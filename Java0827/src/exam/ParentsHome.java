package exam;

// @author kosta, 2015. 8. 27 , 오전 11:52:28 , ParentsHome 
public class ParentsHome {
    private String wallpaper = "red";
    private String furniture = "bed";
    
    public ParentsHome() {
        System.out.println("부모의 생성자가 호출되었습니다.");   
    }
    public void operDoor(){
        System.out.println("부모의 수동문입니다!!!!");
    }
    
    public  void wallpaper(){
        System.out.println("부모의 벽지 색깔은 "+wallpaper);
    }
    public  void furniture(){
        System.out.println("부모의 가구는 "+wallpaper);
    }
    
}
