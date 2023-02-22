package com.iu.s2.util;

public class Pagers {
	
	//검색 종류(사용할 컬럼)
	private String kind;
	//검색어
	private String search;
	//한페이지에 출력할 Row의 갯수 
	private Long perPage;
	//한 블럭(페이지 수)에 출력할 번호의 갯수
	private Long perBlock;
	//Client가 보고싶은페이지 번호(parameter로 받아옴)
	private Long page;
	//전체 page 갯수
	private Long totalpage;
	//Table에서 조회할 시작번호
	private Long startRow;
	//Table에서 조회할 끝번호
	private Long lastRow;
	
	//전체 row의 갯수를 담을 변수
	private Long totalCount;
		
		
		//JSP에 출력하기 위한 시작번호
	private Long startNum;
	//JSP에 출력하기 위한 끝번호
	private Long lastNum;
	//startRow,lastRow 계산 하는 메서드
	
	public void makeRow() {
		startRow=(this.getPage()-1)*this.getPerPage()+1;
		lastRow=this.getPage()*this.getPerPage();
	}
	public void makeNum(Long totalCount) {
		//startNum lastNum
		
		
		//1.전체 row의 갯수를 구하기
				//2.총 page의 갯수
		Long totalPage=totalCount/this.getPerPage();
		if(totalCount%this.getPerPage() != 0) {
			totalPage++;
		}
		
		//3.한 블럭(페이지 수)에 출력할 번호의 갯수
		this.perBlock=5L;
		//4. 총 블럭의 수
		Long totalBlock =totalPage/perBlock;
		if(totalPage%perBlock != 0) {
			totalBlock++;
		}
		//5. page 번호로 현재 블럭 번호 구하기
				// page1-5번이면 curBlock은 1이 되어야함
				// page 6-10 curBlock 2
		Long curBlock=this.getPage()/perBlock;
		if(this.getPage()%perBlock != 0) {
			curBlock++;
		}
		
		//6.curBlock의 시작번호와 끝 번호를 계산
				/* curBlock	startNum	lastNum
				 * 1		1			5
				 * 2		6			10
				 * 3		11			15
				 * 
				 * 
				 * */
		
		startNum=(curBlock-1)*perBlock+1;
		lastNum=curBlock*perBlock;
		
		
		
	}
	
	
	
	

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getSearch() {
		if(this.search ==null) {
			search="";
		}
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public Long getPerPage() {
		
		if(this.perPage==null || this.perPage==0) {
			this.perPage=10L;
		}
		return perPage;
	}

	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}

	public Long getPerBlock() {
		return perBlock;
	}

	public void setPerBlock(Long perBlock) {
		this.perBlock = perBlock;
	}

	public Long getPage() {
		if(this.page ==null || this.page ==0  ) {
			this.page=1L;
		}
		return page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public Long getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(Long totalpage) {
		this.totalpage = totalpage;
	}

	public Long getStartRow() {
		return startRow;
	}

	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}

	public Long getLastRow() {
		return lastRow;
	}

	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getStartNum() {
		return startNum;
	}

	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}

	public Long getLastNum() {
		return lastNum;
	}

	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	
	
	

	
}
