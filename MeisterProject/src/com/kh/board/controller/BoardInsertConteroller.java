package com.kh.board.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.kh.board.model.service.BoardService;
import com.kh.board.model.vo.Attachment;
import com.kh.board.model.vo.Board;
import com.kh.common.MyFileRenamePolicy;
import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class BoardInsertConteroller
 */
@WebServlet("/insert.bo")
public class BoardInsertConteroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardInsertConteroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/views/board/boardInsertView.jsp").forward(request, response);
		request.setCharacterEncoding("UTF-8");
		

		if(ServletFileUpload.isMultipartContent(request)) {

			int maxSize = 1024 * 1024 * 10;
			
			
			String savePath = request.getSession().getServletContext().getRealPath("/resources/board_upfiles/");
			
			
			MultipartRequest multiRequest = new MultipartRequest(request,savePath,maxSize,"UTF-8", new MyFileRenamePolicy());
			
			
			String boardTitle = multiRequest.getParameter("title");
			String boardContent = multiRequest.getParameter("content");
			
			Board b = new Board();
			
			b.setBoardTitle(boardTitle);
			b.setBoardContent(boardContent);
			
			Attachment at = null;
			
			if(multiRequest.getOriginalFileName("upfile") != null) {
				 at= new Attachment();
				 at.setOriginName(multiRequest.getOriginalFileName("upfile"));
				 at.setChangeName(multiRequest.getFilesystemName("upfile"));
				 at.setFilePath("resources/board_upfiles/");
			}
			
			// 4. 서비스 요청
			
			int result = new BoardService().insertBoard(b, at);
				
			if(result > 0 ) {//성공 - >list.bo>currentPage= 1
				request.getSession().setAttribute("alertMsg", "게시글 작성 성공!");
				response.sendRedirect(request.getContextPath()+"/list.bo?current=1");
			}else {// 실패 => 첨부파일 있엇을경우 이미 업로드된 첨부파일을 서버에 보관할 이유가 없다
				if(at != null) {
					//삭제시키고자 하는 파일객체 생성 -> delete메소드 호출
					new File(savePath+at.getChangeName()).delete();
				}
				
				request.setAttribute("errorMsg", "게시글 작성 실패");
				request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
				
			}
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}