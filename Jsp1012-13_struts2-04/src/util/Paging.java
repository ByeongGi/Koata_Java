package util;

import com.sun.javafx.scene.traversal.TopMostTraversalEngine;

public class Paging {
	 // View로 돌려줄 페이징 값 
	 private String pagingCode;
	    public String getPagingCode() {
	        return pagingCode;
	    }
	    public void setPagingCode(String pagingCode) {
	        this.pagingCode = pagingCode;
	    }

	    public Paging(int totalRecord, int nowPage, int numPerPage,
	      int numPerBlock,String url) {
	    // totalRecord :  총 데이터 수를 저장
	    // nowPage : 현재 페이지 
	    // numPerPage : 페이지당 몇줄씩 보여 질 것인지..
	    // numPerBlock : 페이지 [1][2]... 블록을 몇개로 제한할 값  
	    // url : 페이지 이동경로를 저장
	   // 전체 페이지 값 및 전체 블록 값 구하기
	     
	     // 전체 페이지가 2페이지가 있으면
	     // 1.1 -> 2페이지 10/6 = 1.111-> 2 페이지 가 되 기위해서는 
	     //올림처리를 해주어야한다.
	     // Math.ceil()를 사용하면 된다.
	   int totalPage = (int) Math.ceil((double)totalRecord / numPerPage);
	        //전페 블록값을 구한 값
	        //연산결과 :  1페이지부터 1 1 1 1 1 -> 6페이지 1.1 1.2 1.3
	   int totalBlock = (int) Math.ceil((double)totalPage/numPerBlock);
	        //현재 페이지 값에서 페이지 제한수를 나누어서 현재 블록의 값을 구해야한다.
	        int nowBlock = (int) Math.ceil((double)nowPage/ numPerBlock);
	        // 이전 페이지를 구현
	        StringBuffer prev = new StringBuffer();
	        // 다음 페이지 구현
	        StringBuffer next = new StringBuffer();
	        // 페이지 값 구현
	        StringBuffer paging = new StringBuffer();
	        // 이전 페이지 구하는 공식
	        if(nowBlock > 1){ // nowBlock 이 1보다 크다면 이전페이의 링크를 구현
	            prev.append("<a href='").append(url);
	            prev.append("?nowPage=");
	            prev.append((nowBlock - 2) * numPerBlock +1);
	            prev.append("'>◀</a>&nbsp;&nbsp;");
	        }else{
	            prev.append("◀&nbsp;&nbsp;");
	        }

	        // 페이지 출력

	       for(int i=0; i<numPerBlock; i++){
	       //출력되는 페이지 값
	           int printPage = ((nowBlock -1) * numPerBlock) + i + 1;

	          if(printPage == nowPage){ // 현재 페이지일 경우
	              paging.append("<font color='olive'>");
	              paging.append(printPage).append("</font>&nbsp;&nbsp;");
	          }else {
	               // 현재 페이지가 아닐 경우에는 페이지의 차이를 두면 된다.
	               paging.append("<a href='").append(url);
	               paging.append("?nowPage=");
	               paging.append(printPage).append("'>");
	               paging.append(printPage).append("</a>&nbsp;&nbsp;");

	          }
	           // 전체 페이지와 같다면, 페이지 출력문을 빠져 나와야 한다.
	        if(printPage == totalPage){
	            break;
	        }
	       }// for문 종료
	        // 다음 페이지를 구현 : totalBlock 이 nowBlock 보다 클경우
	        if(totalBlock > nowBlock){
	            next.append("<a href='").append(url);
	            next.append("?nowPage=").append(nowBlock * numPerBlock + 1);
	            next.append("'>▶").append("</a>");
	        }else{
	            next.append("&nbsp;&nbsp;▶");
	        }
	        // 페이지가 완성 되었으면  조합된 페이지 코드에 저장
	        pagingCode = prev.toString() + paging.toString() 
	          + next.toString();
	    }

}
