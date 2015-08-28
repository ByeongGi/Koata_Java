package menu;

// @author kosta, 2015. 8. 28 , 오후 7:30:47 , Restaurant 

import java.util.Scanner;
import static menu.ChinaFood.GUNMANDU;
import static menu.ChinaFood.JAJANGMYEON;
import static menu.ChinaFood.JJAMPPONG;
import static menu.ChinaFood.KKANPUNGGI;
import static menu.ChinaFood.TANGSUYUK;
import static menu.KoreanFood.BULGOGI;
import static menu.KoreanFood.GALBI_TANG;
import static menu.KoreanFood.GIMBAP;
import static menu.KoreanFood.MANDU_GUK;
import static menu.KoreanFood.NURUGJI;
import static menu.WestenFood.HAMBURGER;
import static menu.WestenFood.PIZZA;
import static menu.WestenFood.SPAGHETTI;
import static menu.WestenFood.STEAK;

public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant_Meun rm  = new Restaurant_Meun();
        String food="";
        
        System.out.println("무엇을 드시겠습니까?");
        System.out.println("1. 한식 ");
        System.out.println("2. 중식 ");
        System.out.println("3. 양식 ");
        String meun = sc.nextLine();
        switch(meun){
            case "1":
            System.out.println("한식 메뉴 주문");
            System.out.println(GIMBAP);
            System.out.println(MANDU_GUK);
            System.out.println(NURUGJI);
            System.out.println(GALBI_TANG);
            System.out.println(BULGOGI);
            System.out.println("메뉴를 선택하세요!");
            food = sc.nextLine();
            rm.menu_KoreanFood(food);
                break;
            case "2":
            System.out.println("중식 메뉴 주문");
            System.out.println(JAJANGMYEON);
            System.out.println(JJAMPPONG);
            System.out.println(TANGSUYUK);
            System.out.println(GUNMANDU);
            System.out.println(KKANPUNGGI);
            System.out.println("메뉴를 선택하세요!");
            food = sc.nextLine();
            rm.menu_ChinaFood(food);
                break;
            case "3":
            System.out.println("양식 메뉴 주문");
            System.out.println(SPAGHETTI);
            System.out.println(PIZZA);
            System.out.println(STEAK);
            System.out.println(GUNMANDU);
            System.out.println(HAMBURGER);
            System.out.println("메뉴를 선택하세요!");
            food = sc.nextLine();
            rm.menu_WestenFood(food);
                break;
            
        }
    }
}
