package Exam;

// @author kosta, 2015. 8. 25 , 오후 12:44:22 , CarTest 
public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setColor("Red");
        c1.setGearType("Auto");
        c1.setDoor(4);
        
        Car c2 = new Car("Blue","Auto",4 );
        
        System.out.println("c1 의 Color : "+c1.getColor()+" , c1 의 GearType :"+c1.getGearType()+" , c1 의 door :"+c1.getDoor());
        System.out.println("c2 의 Color : "+c2.getColor()+" , c2 의 GearType :"+c2.getGearType()+" , c2 의 door :"+c2.getDoor());
    }
}
