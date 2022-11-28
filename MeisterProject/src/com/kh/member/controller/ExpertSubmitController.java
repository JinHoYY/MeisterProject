package com.kh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.kh.common.MyFileRenamePolicy;
import com.kh.common.model.vo.Attachment;
import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;
import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class ExpertSubmitController
 */
@WebServlet("/expertSubmit.me")
public class ExpertSubmitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExpertSubmitController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		if(ServletFileUpload.isMultipartContent(request)) {
			int maxSize = 1024 * 1024 * 10;
	
			String savePath = request.getSession().getServletContext().getRealPath("/resources/expert_upfiles/");
				
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
	
			int userNo = Integer.parseInt(multiRequest.getParameter("userNo"));
			String userName = multiRequest.getParameter("userName");
			String gender = multiRequest.getParameter("gender");
			String phone = ("010".concat(multiRequest.getParameter("phoneMid"))).concat(multiRequest.getParameter("phoneLast"));
			String email = ((multiRequest.getParameter("emailFront")).concat("@")).concat(multiRequest.getParameter("emailBack"));
			String speciality = multiRequest.getParameter("speciality");
			
			if(speciality.equals("10")) {
				speciality = "영상";
			} else if (speciality.equals("20")) {
				speciality = "영화";
			} else if (speciality.equals("30")) {
				speciality = "게임";
			} else if (speciality.equals("40")) {
				speciality = "IT";
			} else if (speciality.equals("50")) {
				speciality = "운동";
			} else {
				speciality = "요리";
			}
				
			System.out.println("=============파라미터로 값 가져올때");
			System.out.println(userNo);
			System.out.println(userName);
			System.out.println(gender);
			System.out.println(phone);
			System.out.println(email);
			System.out.println(speciality);
			
			Member m = new Member(userName, userNo, gender, email, phone, speciality);
			System.out.println("=============객체넣은후");
			System.out.println(m.getUserNo());
			System.out.println(m.getGender());
			System.out.println(m.getUserName());
			System.out.println(m.getEmail());
			System.out.println(m.getSpeciality());

			Attachment at = null;
			
			if(multiRequest.getOriginalFileName("expertFile") != null) {	
				at = new Attachment();
				at.setRefNo(userNo);
				at.setOriginName(multiRequest.getOriginalFileName("expertFile"));
				at.setChangeName(multiRequest.getFilesystemName("expertFile"));
				at.setFilePath("resources/expert_upfiles/");
			}
			

			
			int result = new MemberService().expertSubmit(m, at);
			
			if(result > 0) {
				HttpSession session = request.getSession();
				session.setAttribute("alertMsg", "전문가 신청이 제출되었습니다.");
				response.sendRedirect(request.getContextPath()+"/mypage.me");
			} else {
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
