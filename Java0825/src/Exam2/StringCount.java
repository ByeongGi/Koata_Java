package Exam2;
// @author kosta, 2015. 8. 25 , 오후 5:22:51 , StringCount 
public class StringCount {
    private int count;
    private String source = "";
    public StringCount(String source){
        this.source = source;
    }
   
    public int stringCount(String s){
        return stringCount(s,0);
    }
    
    public int stringCount(String s,int pos){
        int index=0;
        
        if (s == null || s.length() ==0) { // null / 빈 문자열 검사 
            return 0;
        }
        if (((index = source.indexOf(s,pos))) != -1) { // indexof() 첫번쨰는 pos 검색 시작 위치  // s 찾을 문자열 
            System.out.println("index"+index);
            count++;                                  
            stringCount(s, index + s.length());
            
        }
        return count;
    }
    public static void main(String[] args) {
        String str ="aabbccAABBCCaa";
        System.out.println(str);
        StringCount sc = new StringCount(str);
        System.out.println("aa를 "+sc.stringCount("aa")+"개를 찾았습니다.");
        
        
    }
    
    
    
    
}
