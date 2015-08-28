package menu;
public interface KoreanFood {
    public static final String GIMBAP ="김밥";
    public static final String MANDU_GUK ="만두국";
    public static final String NURUGJI ="누룽지";
    public static final String GALBI_TANG ="갈비탕";
    public static final String BULGOGI ="불고기";
    // 메뉴를 출력한다.
    public abstract void menu_KoreanFood(String order);
}
