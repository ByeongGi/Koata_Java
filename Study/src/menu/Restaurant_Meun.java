package menu;

// @author kosta, 2015. 8. 28 , 오후 7:14:55 , Restaurant_Meun 
public class Restaurant_Meun implements Meun{

    @Override
    public void menu_KoreanFood(String order) {
        meunOrder(order);
    }

    @Override
    public void menu_ChinaFood(String order) {
        meunOrder(order);
    }

    @Override
    public void menu_WestenFood(String order) {
        meunOrder(order);
    }

    @Override
    public void meunOrder(String order) {
        System.out.println( order+" 를 주문 했습니다.");
    }
    
    
    
}
