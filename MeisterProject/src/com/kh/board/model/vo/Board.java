package com.kh.board.model.vo;

import java.util.Date;

public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private int boardCount;
	private int boardRecommend;
	private Date boardDate;
	private String status;
	private int userNO;
	private String titleImg;	// 커뮤니티 게시판에 썸네일 표시용
	
	// 기본생성자
	public Board(int boardNo, String boardTitle, String boardContent, int boardCount, int boardRecommend,
			Date boardDate, String status, int userNO, String titleImg) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardCount = boardCount;
		this.boardRecommend = boardRecommend;
		this.boardDate = boardDate;
		this.status = status;
		this.userNO = userNO;
		this.titleImg = titleImg;
	}
	
	// 게시글 등록 부분 생성자
	public Board(String boardTitle, String boardContent, int userNO) {
		super();
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.userNO = userNO;
	}
	
	// 게시글 수정 부분 생성자
	public Board(int boardNo, String boardTitle, String boardContent, Date boardDate, int userNO) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardDate = boardDate;
		this.userNO = userNO;
	}
	
	// 게시글 목록 불러오기 부분 생성자
	// titleImg는 sql문에서 Attachment 테이블과 조인해서 FILE_PATH || CHANGE_NAME을 가져옵니다
	public Board(int boardNo, String boardTitle, int boardCount, int boardRecommend, Date boardDate, int userNO,
			String titleImg) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardCount = boardCount;
		this.boardRecommend = boardRecommend;
		this.boardDate = boardDate;
		this.userNO = userNO;
		this.titleImg = titleImg;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public int getBoardCount() {
		return boardCount;
	}

	public void setBoardCount(int boardCount) {
		this.boardCount = boardCount;
	}

	public int getBoardRecommend() {
		return boardRecommend;
	}

	public void setBoardRecommend(int boardRecommend) {
		this.boardRecommend = boardRecommend;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getUserNO() {
		return userNO;
	}

	public void setUserNO(int userNO) {
		this.userNO = userNO;
	}

	public String getTitleImg() {
		return titleImg;
	}

	public void setTitleImg(String titleImg) {
		this.titleImg = titleImg;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardCount=" + boardCount + ", boardRecommend=" + boardRecommend + ", boardDate=" + boardDate
				+ ", status=" + status + ", userNO=" + userNO + ", titleImg=" + titleImg + "]";
	}
	
	
	
	
	
	
	
}